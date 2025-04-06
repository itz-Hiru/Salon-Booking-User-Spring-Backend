
# 💇‍♀️ Salon Booking System - User API 💼

![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-00758F?style=for-the-badge&logo=mysql&logoColor=white)
![REST API](https://img.shields.io/badge/REST%20API-005571?style=for-the-badge&logo=protocols&logoColor=white)

> A backend service built with **Spring Boot** for managing users in a Salon Booking System. This microservice handles user registration, authentication, booking details, and profile management via REST APIs.

---

## 🚀 Features

- ✅ User Registration & Login (with validation)
- 🧑 Profile Management (Update/Fetch user details)

---

## 🧰 Tech Stack

- **Java 17**
- **Spring Boot 3+**
- **Spring Security**
- **MySQL** (Database)
- **Lombok**
- **Spring Data JPA**
- **Maven**

---

## 🗂️ API Endpoints Overview

| Method | Endpoint                     | Description                   |
|--------|------------------------------|-------------------------------|
| POST   | `/users`                     | Register a new user           |
| GET    | `/users`                     | Get all users                 |
| GET    | `/users/{id}`                | Get a user                    |
| PUT    | `/users/{id}`                | Update user profile           |
| DELETE | `/users/{id}`                | Delete a user                 |

> 🛡️ All sensitive routes are secured with JWT-based authentication.

---

## 🏁 Getting Started

```bash
# Clone the project
git clone https://github.com/itz-Hiru/Salon-Booking-User-Spring-Backend.git
cd Salon-Booking-User-Spring-Backend

# Build the project
./mvnw clean install

# Run the application
./mvnw spring-boot:run
```

⚡ App runs on: `http://localhost:5001`

---

## ⚙️ Configuration

Edit your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/salon_booking_user_db
spring.datasource.username=your_user_name
spring.datasource.password=your_password
```

---

## 📦 Database Schema Example

```sql
CREATE DATABASE salon_booking_user_db;
```

---

## 🧪 Testing

You can test APIs using:
- 🧪 **Postman**

---

## 📬 Contact

📧 Email: your.email@example.com  
🌐 GitHub: [itz-Hiru](https://github.com/itz-Hiru)

---

## 📄 License

This project is licensed under the **MIT License**. See the [LICENSE](./LICENSE) file for details.
