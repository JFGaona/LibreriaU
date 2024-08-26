# 📚 Librería Online

¡Bienvenido a la **Librería Online**! Este es un proyecto de backend y frontend para Ingeniería de Sistemas, desarrollado con **Java 22** y **Spring Boot**, diseñado para gestionar una librería digital. La aplicación sigue la arquitectura MVC y se conecta a una base de datos MySQL.

## 🚀 Características

- **Gestión de Usuarios**: Registro, gestión y autenticación de usuarios.
- **Gestión de Libros**: Registro y administración de libros, categorías, autores y editoriales.
- **Gestión de Transacciones**: Manejo de compras, pagos y envíos.
- **Reseñas y Listas de Deseos**: Los usuarios pueden dejar reseñas y crear listas de deseos.
- **Cupones y Descuentos**: Aplicación de cupones de descuento en las compras.


📂 Paquete controller
Este paquete contiene los controladores que manejan las peticiones HTTP para las diferentes entidades, exponiendo las APIs REST.

📂 Paquete model
Contiene las clases de entidad que representan las tablas de la base de datos.

📂 Paquete repository
Incluye las interfaces que extienden JpaRepository para proporcionar métodos CRUD sobre las entidades.

📂 Paquete service
Contiene la lógica de negocio de la aplicación, que se encuentra entre los controladores y los repositorios.

📚 Endpoints Principales
GET	/api/users	Obtiene todos los usuarios

POST	/api/users	Crea un nuevo usuario

GET	/api/books	Obtiene todos los libros

POST	/api/books	Añade un nuevo libro

GET	/api/transactions	Obtiene todas las transacciones

POST	/api/transactions	Crea una nueva transacción


🛠️ Tecnologías Utilizadas
Java 22
Spring Boot
MySQL
Maven

