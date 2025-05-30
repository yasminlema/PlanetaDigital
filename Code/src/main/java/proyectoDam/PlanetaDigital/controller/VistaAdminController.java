package proyectoDam.PlanetaDigital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import proyectoDam.PlanetaDigital.model.Categoria;
import proyectoDam.PlanetaDigital.model.Libro;
import proyectoDam.PlanetaDigital.repository.CategoriaRepository;
import proyectoDam.PlanetaDigital.repository.LibroRepository;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class VistaAdminController {
    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    // metodo que se encarga de listar todos los libros de la base de datos y las categorias, ademas de filtrar por categoria
    @GetMapping("/admin")
    public String mostrarLibros(@RequestParam(name = "categoriaFiltro", required = false) Integer categoriaCod, Model model) {
        List<Categoria> categorias = categoriaRepository.findAll(); //crea una lista con todas las categorias de la base de datos 
        //crea una lista con todos los libros de la base de datos por orden alfabetico
        List<Libro> libros = (categoriaCod != null)
                ? libroRepository.findByCategoria_CategoriaCodOrderByLibrotituloAsc(categoriaCod) //si se aplica un filtro de categoria, solo muestra los libros de esa categoria
                : libroRepository.findAllByOrderByLibrotituloAsc();

        model.addAttribute("categorias", categorias);
        model.addAttribute("libros", libros);
        model.addAttribute("categoriaFiltro", categoriaCod);

        return "admin";
    }

    // metodo para actualiza cualquier campo de los libros
    @PostMapping("/actualizarLibro")
    public String actualizarLibro(
            @ModelAttribute Libro libro,
            @RequestParam(value = "nuevaImagen", required = false) MultipartFile nuevaImagen,
            @RequestParam(value = "nuevoPdf", required = false) MultipartFile nuevoPdf
    ) {
        try {
            String rutaBase = System.getProperty("user.dir") + "/subidas/"; // ruta base de las imagenes y pdf
            Libro libroExistente = libroRepository.findById(libro.getLibroCod()).orElse(null); // busca el libro por librocod

            // si no se encuentra el libro devuelve un error
            if (libroExistente == null) {
                return "redirect:/admin?errorLibroNoEncontrado";
            }

            String nombreBase = libro.getLibrotitulo().trim().replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9_]", ""); // nombre base de la imagen o/y pdf nuevo que se va a subir

            // nombre y ruta donde se gusrdara la imagen
            String imagenNombre = nombreBase + ".jpg";
            File imagenDestino = new File(rutaBase + "imagenes/libros/", imagenNombre);
            // si se añade una imagen nueva se sube esa imagen, pero si ademas ya hay una subida primero borra la subida para subir la nueva
            if (nuevaImagen != null && !nuevaImagen.isEmpty()) {
                if (imagenDestino.exists()) imagenDestino.delete();
                nuevaImagen.transferTo(imagenDestino);
                libro.setLibroimagen(imagenNombre);
            } else {
                libro.setLibroimagen(libro.getLibroimagen());
            }

            // lo mismo de la imagen lo hace con el pdf
            String pdfNombre = nombreBase + ".pdf";
            File pdfDestino = new File(rutaBase + "pdf/libros/", pdfNombre);
            if (nuevoPdf != null && !nuevoPdf.isEmpty()) {
                if (pdfDestino.exists()) pdfDestino.delete();
                nuevoPdf.transferTo(pdfDestino);
                libro.setLibroPdf(pdfNombre);
            } else {
                libro.setLibroPdf(libro.getLibroPdf());
            }

            // si no se modifica la categoria mantiene la que ya tiene
            if (libro.getCategoria() == null || libro.getCategoria().getCategoriaCod() == null) {
                libro.setCategoria(libroExistente.getCategoria());
            }

            libroRepository.save(libro);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:/admin";
    }

    //metodo para agregar libros nuevos, parecido al metodo de actualizar
    @PostMapping("/guardarLibro")
    public String guardarLibro(
            @RequestParam("librotitulo") String titulo,
            @RequestParam("libroautor") String autor,
            @RequestParam("libroDescripcion") String descripcion,
            @RequestParam(name = "librocat", required = false) Integer librocat,
            @RequestParam("categoriaCod") int categoriaCod,
            @RequestParam("libroimagen") MultipartFile imagen,
            @RequestParam("libroPdf") MultipartFile pdf
    ) {
        try {
            if (imagen.isEmpty() || pdf.isEmpty()) {
                System.out.println("Archivo faltante");
                return "redirect:/admin?errorArchivo";
            }

            String rutaBase = System.getProperty("user.dir") + "/subidas/";

            File carpetaImagenes = new File(rutaBase + "imagenes/libros/");
            File carpetaPdf = new File(rutaBase + "pdf/libros/");

            carpetaImagenes.mkdirs();
            carpetaPdf.mkdirs();

            String nombreBase = titulo.trim().replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9_]", "");

            String imagenNombre = nombreBase + ".jpg";
            String pdfNombre = nombreBase + ".pdf";

            File imagenDestino = new File(carpetaImagenes, imagenNombre);
            imagen.transferTo(imagenDestino);

            File pdfDestino = new File(carpetaPdf, pdfNombre);
            pdf.transferTo(pdfDestino);

            Libro libro = new Libro();
            libro.setLibrotitulo(titulo);
            libro.setLibroautor(autor);
            libro.setLibroDescripcion(descripcion);
            libro.setLibrocat(librocat);
            libro.setLibroimagen(imagenNombre);
            libro.setLibroPdf(pdfNombre);
            libro.setCategoria(categoriaRepository.findById(categoriaCod).orElse(null));

            libroRepository.save(libro);

            System.out.println("Libro guardado: " + titulo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/admin";
    }

    //metodo para eliminar un libro
    @GetMapping("/eliminarLibro/{id}")
    public String eliminarLibro(@PathVariable("id") Integer id) {
        try {
            Libro libro = libroRepository.findById(id).orElse(null); // busca el libro por el id del libro
            // si existe el libro busca la imagen y el pdf y si hay los borra antes de borrar el libro de la BD
            if (libro != null) {
                String rutaBase = System.getProperty("user.dir") + "/subidas/";

                if (libro.getLibroimagen() != null) {
                    File imagenArchivo = new File(rutaBase + "imagenes/libros/" + libro.getLibroimagen());
                    if (imagenArchivo.exists()) {
                        imagenArchivo.delete();
                    }
                }

                if (libro.getLibroPdf() != null) {
                    File pdfArchivo = new File(rutaBase + "pdf/libros/" + libro.getLibroPdf());
                    if (pdfArchivo.exists()) {
                        pdfArchivo.delete();
                    }
                }

                libroRepository.deleteById(id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/admin";
    }

}
