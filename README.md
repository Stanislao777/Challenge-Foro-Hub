# 🚀 **Foro-Hub: API REST - Challenge Alura LATAM** 🚀

![Foro-Hub-API REST](https://bs-uploads.toptal.io/blackfish-uploads/components/blog_post_page/4085906/cover_image/regular_1708x683/cover-0324-0d8581d2f0e5248d37217bee9e86a5f1.png)

**Descripción:**  
Foro-Hub es una API REST creada para un foro de tópicos, basados en la muestra del Challenge, implementada con **Java 21**, **Spring Boot 3.4.1**, y **Maven 4.0.0**. Este proyecto está diseñado con un enfoque en la seguridad y protección de las solicitudes, utilizando JWT para la autenticación y validación, con MySQL para la persistencia de datos.

[![Java](https://img.shields.io/badge/Java-21.0.2-blue)]() 
[![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-orange)]() 
[![Maven](https://img.shields.io/badge/Maven-3.8.4-red)]() 
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.1-green)]() 
[![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)]()

## 🛠 **Tecnologías Usadas**

- **Lenguaje:** Java 21
- **Framework:** Spring Boot 3.4.1
- **Construcción:** Maven 4.0.0
- **Base de Datos:** MySQL 8.0.40
- **Gestión de Dependencias:** Maven
- **API REST** con autenticación JWT
- **Desarrollo de Base de Datos:** Flyway para gestión de migraciones de base de datos

## 🔒 **Seguridad y Protección**

El proyecto implementa varias características clave de seguridad:

- **Spring Security** para proteger las rutas de acceso y asegurar las conexiones.
- **JWT** para la autenticación, proporcionando un sistema seguro y sin estado para la verificación de usuarios.
- **Validación de datos** usando **Spring Boot Starter Validation** para garantizar la integridad de los datos recibidos.

## 🏁 **Requisitos Previos**

Antes de ejecutar la aplicación, asegúrate de tener instalados los siguientes componentes:

- [**Java SE Development Kit (JDK) 21.0.2**](https://www.oracle.com/java/technologies/javase/jdk21-downloads.html)  
  El **JDK 21** es la versión mínima necesaria para ejecutar y desarrollar en este proyecto.

- [**IntelliJ IDEA**](https://www.jetbrains.com/idea/download/)  
  Se recomienda usar **IntelliJ IDEA** para una mejor experiencia de desarrollo, ya que ofrece soporte completo para **Java**, **Maven** y **Spring Boot**.

- [**MySQL 8.0.40**](https://dev.mysql.com/downloads/installer/)  
  Asegúrate de tener instalada la versión **MySQL 8.0.40** o una versión compatible para manejar la persistencia de datos del proyecto.

- [**Maven 4.0.0**](https://maven.apache.org/)  
  Maven es necesario para la gestión de dependencias y construcción del proyecto.

## 📦 **Dependencias Principales**

Este proyecto utiliza las siguientes dependencias esenciales:

### Dependencias de Spring Boot:
- **spring-boot-starter-web**: Proporciona todo lo necesario para crear una API REST.
- **spring-boot-devtools**: Para facilitar el desarrollo con reinicios automáticos.
- **spring-boot-starter-data-jpa**: Para la interacción con bases de datos usando JPA (Java Persistence API).
- **spring-boot-starter-validation**: Para la validación de datos en la API.

### Otras Dependencias:
- **lombok**: Para reducir el boilerplate de código.
- **flyway-core** y **flyway-mysql**: Para la gestión y migración de esquemas de base de datos.
- **mysql-connector-j**: Conector JDBC para la base de datos MySQL.
- **java-jwt**: Biblioteca para generar y verificar JWT.

### Dependencias de Seguridad:
- **spring-boot-starter-security**: Para implementar seguridad en la API.
- **spring-security-test**: Para pruebas relacionadas con la seguridad de la API.

## 🔧 **Instalación y Configuración**

1. **Clona el repositorio:**
   ```bash
   git clone https://github.com/Stanislao777/Challenge-Foro-Hub

## Autor

- **Stan V.V** - Desarrollador
- Programa ONE - Alura LATAM
