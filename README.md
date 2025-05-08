# PlanetaDigital
Proyecto fin de ciclo DAM

![imagen](https://github.com/user-attachments/assets/72270f86-4cc9-4ed4-baeb-f2dee2577265)
## Índice
* [Objetivo](#Objetivo)
* [Descripción](#Descripción)
  * [¿A quién va dirigido?](#A-quién-va-dirigido)
  * [Esquema Entidad Relación](#Esquema-Entidad-Relación)
  * [Casos de uso](#Casos-de-uso)
  * [Tecnologías a utilizar](#Tecnologías-a-utilizar)
  * [Frontend](#Frontend)
  * [Backend](#Backend)
  * [Gestor de BBDD](#Gestor-de-BBDD)
  * [Guía de estilo](#Guía-de-estilo)
  * [Estructura](#Estructura)
  * [Colores](#Colores)
* [Alcance](#Alcance)
* [Ejecución](#Ejecución)
  * [Descripción de las páginas y flujo de datos](#Descripción-de-las-páginas-y-flujo-de-datos)
* [Problemas y cambios](#Problemas-y-cambios)
  * [Cambio de tecnologia front](#Cambio-de-tecnologia-front)
  * [Cambio en el numero de usuarios](#Cambio-en-el-numero-de-usuarios)
  * [Problemas con las imagenes](#Problemas-con-las-imagenes)
## Objetivo
Crear una plataforma digital que permita a los usuarios leer libros en línea sin necesidad de llevarlos físicamente, además de ofrecer un espacio para intercambiar opiniones con otros lectores.
## Descripción
El sitio web contará con un extenso catálogo de libros de diversos géneros y temas. Los usuarios podrán registrarse gratuitamente para explorar la colección, conocer detalles sobre cada libro y empezar con la lectura de estos.
### ¿A quién va dirigido?
Dirigido a amantes de la lectura que buscan una forma práctica y accesible de disfrutar de los libros desde cualquier dispositivo conectado a Internet. La plataforma facilitará la búsqueda de títulos por categorías y nombre, permitirá guardar favoritos y dejar comentarios y valoraciones de los libros.
### Esquema Entidad Relación
![ER](https://github.com/user-attachments/assets/6c593c06-1f22-4014-8af3-102f5e073b2e)
### Casos de uso
![CS](https://github.com/user-attachments/assets/990affb2-f20f-450b-893f-fd874bb8e859)
### Tecnologías a utilizar
![imagen](https://github.com/user-attachments/assets/a2d5b7d7-ebdd-44b8-bdaf-54a21f97ca18) ![imagen](https://github.com/user-attachments/assets/d094ba54-5040-415f-b9b3-cd5bf35ab31d) ![imagen](https://github.com/user-attachments/assets/a5cba7c4-cd8e-4475-a7d3-8f63a1811c99)

Escogí estas tecnologías ya que son ampliamente conocidas y cuentan con abundante documentación y recursos de aprendizaje, además de que son los lenguajes que hemos dado en el ciclo y quería mejorar mis habilidades en estas tecnologías.
#### Frontend
* HTML (HyperText Markup Language)
* CSS (Cascading Style Sheets) -> Tailwind CSS
* JavaScript
#### Backend
* Java
* SpringBoot
#### Gestor de BBDD
* MySQL: Es un sistema de gestión de bases de datos relacional de código abierto. Elegí esta base de datos porque es con la que estoy más familiarizada, por su alta fiabilidad, rendimiento y facilidad de uso, además de su excelente compatibilidad con PHP.
### Guía de estilo
#### Estructura
La estructura del sitio web sigue un esquema claro y organizado para mejorar la experiencia del usuario. Se utilizan contenedores y flexbox para alinear y distribuir los elementos de manera uniforme. Una estructura bien definida facilita la navegación y la localización de información, mejorando la usabilidad y la satisfacción del usuario.
#### Colores
![imagen](https://github.com/user-attachments/assets/54c4856e-a48a-4f94-94de-7a8d1a4fcb5f)**_#31c57e_**
![imagen](https://github.com/user-attachments/assets/ceec7d14-5b46-4c37-bbfd-9fef335d5392)**_#217551_**
![imagen](https://github.com/user-attachments/assets/ff38015d-659c-4aa3-b595-94d520711e91)**_#348f66_**
![imagen](https://github.com/user-attachments/assets/eac96e27-2afc-4bf4-b227-56b182b7aca4)**_#666666_**
![imagen](https://github.com/user-attachments/assets/8f722570-439b-49b1-a5b5-c4595fdd698d)**_#333333_**
![imagen](https://github.com/user-attachments/assets/15f84492-f5b7-4e3d-af62-37c64eb7747e)**_#000000_**
![imagen](https://github.com/user-attachments/assets/4aa31b2f-e41a-43d8-99e3-5d3905ab4a88)**_#FFFFFF_**

Los colores seleccionados crean un contraste adecuado para la legibilidad y son visualmente atractivos. El verde principal transmite frescura y confianza, mientras que los colores neutros equilibran el diseño.
## Alcance
El proyecto incluirá las siguientes funcionalidades principales: 
* Hacer que el sitio web sea fácil de usar y tenga buen aspecto, para que puedan encontrar los libros que desee de forma rápida y sencilla.
* Se creará un sistema donde los usuarios puedan registrarse e iniciar sesión.
* Se creará un sistema para el admin para mostrar la lista de libros que hay y pueda añadir más, editar y eliminar.
* Crear un sistema donde la gente pueda dar su opinión y hablar sobre los libros.
* Guardar los libros en favoritos.
* Barra de búsqueda para que los usuarios puedan encontrar los libros de forma más sencilla.
## Ejecución
### Descripción de las páginas y flujo de datos
Al acceder a la página web, lo primero que veremos será la página principal, visible únicamente cuando la sesión no está iniciada. En ella, podremos encontrar lo que podremos hacer si nos suscribimos.
Además, la cabecera será prácticamente la misma en todas las páginas, aunque algunos botones en forma de iconos aparecerán o desaparecerán dependiendo de si la sesión está iniciada, si somos suscriptores o administradores.
Por otro lado, el footer será uniforme en todas las páginas, excepto en la de inicio de sesión.
## Problemas y cambios
### Cambio de tecnologia front
Empece usando CSS para los estilos de mi página web, pero hacerla responsiva se me complicaba bastante. Luego descubrí Tailwind CSS, lo probé y me resultó mucho más fácil darle el aspecto que quería y hacerla responsiva.
### Cambio en el numero de usuarios
Al principio, pensé en cuatro tipos de usuarios para mi página web. El primero sería el usuario no registrado, que solo tendría acceso a la página principal con información sobre las suscripciones. Luego, habría un segundo usuario que podría ver el catálogo de libros, y un tercero que, tras pagar una cuota anual, tendría acceso completo: lectura, comentarios, favoritos, etc. Finalmente, el usuario administrador podría hacer todo lo anterior, además de gestionar los libros (añadir, editar y borrar).
Sin embargo, decidí eliminar la opción de suscripción con pago anual, ya que el usuario intermedio, con acceso solo al catálogo, no tenía mucho sentido. Además, no puedo cobrar por el contenido, ya que los libros son de dominio público.
### Problemas con las imagenes
Tuve problemas con las imágenes del header y footer, ya que solo se cargaban en la primera página. Cuando redirigía a otra, simplemente no aparecían. Al final, la solución era bastante sencilla: usar direcciones absolutas. Sin ellas, al cambiar de página, el sistema buscaba las imágenes en la ruta equivocada.
