# PlanetaDigital
Proyecto fin de ciclo DAM

## Índice
* [Introducción](#Introdución)
  * [Logo](#Logo)
  * [Objetivo](#Objetivo)
  * [¿A quién va dirigido?](#A-quién-va-dirigido)
* [Descripción](#Descripción)
  * [Tecnologías a utilizar](#Tecnologías-a-utilizar)
    * [Frontend](#Frontend)
    * [Backend](#Backend)
    * [Gestor de BBDD](#Gestor-de-BBDD)
  * [Esquema Entidad Relación](#Esquema-Entidad-Relación)
  * [Guía de estilo](#Guía-de-estilo)
    * [Estructura](#Estructura)
    * [Colores principales](#Colores-principales)
  * [Alcance](#Alcance)
* [Ejecución](#Ejecución)
  * [Descripción de las páginas y flujo de datos](#Descripción-de-las-páginas-y-flujo-de-datos)
* [Problemas y cambios](#Problemas-y-cambios)
  * [Cambio de tecnologia front](#Cambio-de-tecnologia-front)
  * [Cambio en el numero de usuarios](#Cambio-en-el-numero-de-usuarios)
  * [Problemas con las imagenes](#Problemas-con-las-imagenes)
  * [Problema con el formulario de contacto](#Problema-con-el-formulario-de-contacto)
  * [Problemas con la subida de imágenes y pdf](#Problemas-con-la-subida-de-imágenes-y-pdf)
## Intruducción
### Logo
![imagen](https://github.com/user-attachments/assets/72270f86-4cc9-4ed4-baeb-f2dee2577265)
### Objetivo
Crear una plataforma digital que permita a los usuarios leer libros en línea de forma gratuita sin necesidad de llevarlos físicamente, además de ofrecer un espacio para intercambiar opiniones con otros lectores.
### ¿A quién va dirigido?
Dirigido a amantes de la lectura que buscan una forma práctica y accesible de disfrutar de los libros desde cualquier dispositivo conectado a Internet. La plataforma facilitará la búsqueda de títulos por categorías y nombre, permitirá guardar favoritos y dejar comentarios y valoraciones de los libros.
## Descripción
### Tecnologías a utilizar
Escogí estas tecnologías ya que son ampliamente conocidas y cuentan con abundante documentación y recursos de aprendizaje, además de que son los lenguajes que hemos dado en el ciclo y quería mejorar mis habilidades en estas tecnologías.
#### Frontend
* HTML (HyperText Markup Language)
* Tailwind CSS: es un framework CSS de utilidad que te permite crear diseños de sitios web personalizables y ágiles, utilizando un conjunto de clases predefinidas en tu HTML.
* JavaScript
#### Backend
* Java
* SpringBoot
#### Gestor de BBDD
Elegí esta base de datos porque es con la que estoy más familiarizada.
* MySQL: Es un sistema de gestión de bases de datos relacional de código abierto. 
### Esquema Entidad Relación
![ER_PlanetaDigital drawio(1)](https://github.com/user-attachments/assets/9c723596-2c41-490a-a9f5-5e3fd9052b98)
### Guía de estilo
#### Estructura
La estructura del sitio web sigue un esquema claro y organizado para mejorar la experiencia del usuario. Estructura bien definida que facilita la navegación y la localización de información, mejorando la usabilidad y la satisfacción del usuario. Es una página responsive.
#### Colores principales
<img width="65" alt="verdeClaro" src="https://github.com/user-attachments/assets/41f940e0-7761-4140-9355-781a9cc30779" /> *_bg-green-500_*
<img width="59" alt="verdemedio" src="https://github.com/user-attachments/assets/9764c92b-d1b6-4a79-9288-53b16fa926c4" /> *_bg-green-600_*
<img width="59" alt="verdeOscuro" src="https://github.com/user-attachments/assets/e70a6d62-7886-471c-99ae-c4513548e7c1" /> *_bg-green-700_*
<img width="58" alt="blanco" src="https://github.com/user-attachments/assets/54393232-d263-49a0-b447-d0904d698765" /> *_bg-white_*
<img width="60" alt="gris" src="https://github.com/user-attachments/assets/f26cc4aa-4b05-4afb-a89b-0d33ef4ae9bd" /> *_bg-gray-700_*

Los colores seleccionados crean un contraste adecuado para la legibilidad y son visualmente atractivos. El verde principal transmite frescura y confianza, mientras que los colores neutros equilibran el diseño.
### Alcance
El proyecto incluirá las siguientes funcionalidades principales:
* Hacer que el sitio web sea fácil de usar
* Formularios donde los usuarios puedan registrarse e iniciar sesión
* Posibilidad de recuperar la contraseña
* Posibilidad de listar todos los libros, o libros según su género
* Página para el admin para mostrar la lista de libros que hay y pueda añadir más, editar y eliminar
* Habra otra pagina para el admin para añadir o eliminar los géneros de libros que este desee
* Los usuarios podrán dejar comentarios y evaluar los libros
* Los usuario podrán guardar los libros en favoritos
* Barra de búsqueda para la búsqueda de libros según el título

## Ejecución
### Descripción de las páginas y flujo de datos
Al acceder a la página web, lo primero que veremos será la página principal, visible solo cuando la sesión no está iniciada. En ella, encontraremos información sobre las suscripciones y lo que podremos hacer si nos registramos. La cabecera será prácticamente la misma en todas las páginas, aunque algunos iconos aparecerán o desaparecerán dependiendo de si la sesión está iniciada, si somos suscriptores o administradores. Además, el logo siempre nos llevará a la página principal que corresponda a nuestro tipo de usuario. Por otro lado, el footer se mantendrá uniforme en todas las páginas, excepto en la de inicio de sesión y registro. Desde la página principal, podremos acceder a la pantalla de inicio de sesión si ya tenemos cuenta, o a la de registro si somos nuevos usuarios. Si el registro es exitoso, nos llevará directamente a la página de login. Desde el login también podremos hacer una recuperación de la contraseña. Una vez iniciada la sesión, seremos redirigidos a la página principal de usuarios logueados, donde tendremos acceso a todos los libros. En el header, el icono de login cambiará por un desplegable que mostrará nuestro nombre, permitiéndonos acceder al perfil de usuario y cerrar sesión. En el perfil, podremos ver y modificar nuestra información personal. De vuelta en la página principal, además del cambio en el icono de sesión, aparecerán dos nuevos iconos: uno para la lista de libros favoritos del usuario y otro exclusivo para el administrador, donde podrá editar, añadir y eliminar libros. También desde el header se podrá realizar la búsqueda de libros. Desde la página principal, podremos explorar las diferentes categorías de libros y ver todos los títulos de cada una, además de acceder al catálogo completo de libros, ya que en la página principal solo están los libros que tiene el admin asignado como destacado. En cualquier página que liste libros, podremos hacer clic sobre la imagen de un título para acceder a su información, la opción de lectura y los comentarios. En la pagina del admin este verá una tabla con todos los libros donde podrá editarlos y eliminarlos, además habrá dos botones uno para añadir o eliminar categorías nuevas y otro botón para añadir libros nuevos.
![FlujoPaginas drawio](https://github.com/user-attachments/assets/e1eb2211-ba97-4637-bdbc-1fc5f7ff8ff7)
## Problemas y cambios
### Cambio de tecnologia front
Empecé usando CSS para los estilos de mi página web, pero hacerla responsiva se me complicaba bastante. Luego descubrí Tailwind CSS, lo probé y me resultó mucho más fácil darle el aspecto que quería y hacerla responsiva.
### Cambio en el numero de usuarios
Al principio, pensé en cuatro tipos de usuarios para mi página web. El primero sería el usuario no registrado, que solo tendría acceso a la página principal con información sobre las suscripciones. Luego, habría un segundo usuario que podría ver el catálogo de libros, y un tercero que, tras pagar una cuota anual, tendría acceso completo: lectura, comentarios, favoritos, etc. Finalmente, el usuario administrador podría hacer todo lo anterior, además de gestionar los libros (añadir, editar y borrar).
Sin embargo, decidí eliminar la opción de suscripción con pago anual, ya que el usuario intermedio, con acceso solo al catálogo, no tenía mucho sentido. Además, no puedo cobrar por el contenido, ya que los libros son de dominio público.
### Problemas con las imagenes
Tuve problemas con las imágenes del header y footer, ya que solo se cargaban en la primera página. Cuando redirigía a otra, simplemente no aparecían. Al final, la solución era bastante sencilla: usar direcciones absolutas. Sin ellas, al cambiar de página, el sistema buscaba las imágenes en la ruta equivocada.
### Problema con el formulario de contacto
Tuve problemas con el formulario de contacto para enviar los correos porque parecía que estaba funcionando todo bien, pero no recibía los correos. Esto sucedía porque gmail lo tenía capado el enviar correos sin ser desde la plataforma. Lo solucione creando una clave para aplicaciones externas en gmail. Además de este problema también tuve otro que el envío del correo tardaba un poco y si le dabas en ese tiempo a enviar varias veces, se enviaba varias veces ese correo. Lo solucione poniendo una pantalla de carga y bloqueando el botón de enviar.
### Problemas con la subida de imagenes y pdf
Aunque el código en principio parecía que estaba correcto al enviar el formulario la imagen y el pdf del libro no se subían y no se añadían a la carpeta que correspondía. La solución encontrada a este problema fue que en vez de tenerlos en las rutas de los resources/static las imágenes y pdf hago que se añadan en una carpeta en la raíz del proyecto y cambie la ruta que tiene definida spring boot como predefinida a esa carpeta.
