# 📚 Librería Online

¡Bienvenido a la **Librería Online**! Este es un proyecto de backend desarrollado con **Java 22** y **Spring Boot**, diseñado para gestionar una librería digital. La aplicación sigue la arquitectura MVC y se conecta a una base de datos MySQL.

## 🚀 Características

- **Gestión de Usuarios**: Registro, gestión y autenticación de usuarios.
- **Gestión de Libros**: Registro y administración de libros, categorías, autores y editoriales.
- **Gestión de Transacciones**: Manejo de compras, pagos y envíos.
- **Reseñas y Listas de Deseos**: Los usuarios pueden dejar reseñas y crear listas de deseos.
- **Cupones y Descuentos**: Aplicación de cupones de descuento en las compras.

## 🗂️ Estructura del Proyecto

```plaintext
Librería
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── libreria
│   │   │           ├── controller
│   │   │           ├── model
│   │   │           ├── repository
│   │   │           ├── service
│   │   │           └── LibreriaApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   └── test
└── pom.xml
