# Employee Management System

## 📖 Overview

A full-stack web application for managing employees, built with a Spring Boot backend and a React frontend. This project demonstrates a robust, professional implementation of a CRUD-based system with key features expected in modern web applications.

## 🚀 Key Features

- **CRUD Operations**: Create, Read, Update, and Delete employee records.
- **Search Functionality**: REST endpoint to search for employees by their department.
- **Pagination**: Efficiently browse through large sets of employee data with paginated results.
- **Backend Validation**: Ensures data integrity using Jakarta Validation annotations (`@NotBlank`, `@Email`, `@NotNull`).
- **Secure Configuration**: Database credentials are managed securely through environment variables, avoiding hard-coded values.
- **Authentication**: Implemented simple HTTP Basic Authentication with an in-memory user for protected endpoints.
- **RESTful API**: A well-structured REST API for seamless communication between the backend and frontend.

## 🧰 Tech Stack

- **Backend**: Spring Boot, Spring Data JPA, Spring Security
- **Database**: MySQL
- **Frontend**: React (or any other client)
- **Build Tool**: Maven

## ⚙️ Setup and Configuration

### Prerequisites

- Java 17 or later
- Maven
- MySQL Server

### Backend Setup

1.  **Clone the repository:**
    ```bash
    git clone <your-repository-link>
    cd springboot-backend
    ```

2.  **Configure Environment Variables:**
    Set the following environment variables to configure the database connection.
    - `SPRING_DATASOURCE_URL`: The JDBC URL for your MySQL database (e.g., `jdbc:mysql://localhost:3306/employee_management_system?useSSL=false`)
    - `DB_USER`: Your MySQL username.
    - `DB_PASS`: Your MySQL password.

3.  **Run the application:**
    ```bash
    mvn spring-boot:run
    ```
    The backend server will start on `http://localhost:8080`. The API endpoints are secured with HTTP Basic Authentication (user: `admin`, password: `admin123`).

## 👨‍💻 Developer Contact

- **Jainil Patil**
- **Email**: jainilpatil510@gmail.com
- **GitHub**: [jainil510](https://github.com/jainil510)
- **LinkedIn**: [jainilpatil](https://www.linkedin.com/in/jainilpatil/)

---
© 2025 Jainil Patil