# PlanetaDigital
Proyecto fin de ciclo DAW

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
## Objetivo
El objetivo del proyecto es crear un sitio web donde la gente pueda leer diferentes libros en línea sin necesidad de llevarlos encima, además de la posibilidad de compartir su opinión sobre el libro con otras personas que también lo haya leído.
## Descripción
Los usuarios podrán explorar un gran catálogo de libros sobre diversos temas y géneros en la página. Podrán registrarse de forma gratuita para consultar la lista de libros disponibles y obtener información sobre ellos. Pero para leerlos, deberán pagar una tarifa mensual.
### ¿A quién va dirigido?
El sitio web va dirigido a personas a las que les gusta leer y aman los libros. Esta web les ofrece una forma sencilla y fácil de acceder a muchos libros de diferentes géneros y todo esto en línea. La página permite a los usuarios buscar y encontrar libros en varias categorías y temas. Además, está destinado a personas que desean la comodidad de acceder a su biblioteca desde cualquier dispositivo conectado a Internet. Los usuarios pueden explorar y guardar en favoritos una amplia gama de libros. También pueden interactuar con otros lectores dejando comentarios y expresando sus puntos de vista. Al suscribirse anualmente, los lectores pueden disfrutar de acceso ilimitado a todos los libros que se ofrecen, lo que garantiza una experiencia de lectura de alta calidad.
### Esquema Entidad Relación
![ER](https://github.com/user-attachments/assets/6c593c06-1f22-4014-8af3-102f5e073b2e)
### Casos de uso
![CS](https://github.com/user-attachments/assets/990affb2-f20f-450b-893f-fd874bb8e859)
### Tecnologías a utilizar
![imagen](https://github.com/user-attachments/assets/a2d5b7d7-ebdd-44b8-bdaf-54a21f97ca18) ![imagen](https://github.com/user-attachments/assets/d094ba54-5040-415f-b9b3-cd5bf35ab31d) ![imagen](https://github.com/user-attachments/assets/a5cba7c4-cd8e-4475-a7d3-8f63a1811c99) ![imagen](https://github.com/user-attachments/assets/210e27f7-1bb2-4744-93e3-d9413c1ab356)

Escogí estas tecnologías ya que son ampliamente conocidas y cuentan con abundante documentación y recursos de aprendizaje, además de que son los lenguajes que hemos dado en el ciclo y quería mejorar mis habilidades en estas tecnologías.
#### Frontend
* HTML (HyperText Markup Language)
* CSS (Cascading Style Sheets)
* JavaScript
#### Backend
* PHP (Hypertext Preprocessor)
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
* Sistema de suscripción con pago para que los usuarios puedan leer los libros.
* Crear un sistema donde la gente pueda dar su opinión y hablar sobre los libros.
* Guardar los libros en favoritos.
* Barra de búsqueda para que los usuarios puedan encontrar los libros de forma más sencilla.
## Ejecución
### Descripción de las páginas y flujo de datos
Lo primero que vemos es la página principal con una cabecera que está en todas las páginas, con mínimas diferencias, dependiendo de la suscripción. En esta página vemos primero la presentación de la página y sobre nosotros al final del todo de esta están las posibles suscripciones y lo que tiene cada suscripción. Por último, se ve el footer que está en todas las páginas y contiene por una parte los datos de contacto y por otra parte enlaces a las redes sociales. Para iniciar sesión el usuario tendrá que pulsar sobre el icono del muñeco que se encuentra en la cabecera.

![imagen](https://github.com/user-attachments/assets/42f763d4-10d0-435e-bff9-1b404725c511)
