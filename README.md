# 🎓 Student Management System (Spring Boot + JPA + PostgreSQL)

A simple and clean **RESTful backend application** built using Spring Boot that manages student data with full CRUD operations. This project demonstrates real-world backend development practices like layered architecture, DTO usage, and global exception handling.

---

## 🚀 Features

* ✅ Create, update, delete student records
* ✅ Fetch all students or a specific student by ID
* ✅ RESTful API design using proper HTTP methods
* ✅ DTO-based data transfer
* ✅ Global exception handling with structured error responses
* ✅ PostgreSQL database integration using Spring Data JPA

---

## 🛠️ Tech Stack

* **Java**
* **Spring Boot**
* **Spring Data JPA (Hibernate)**
* **PostgreSQL**
* **Git & GitHub**

---

## 🌐 API Endpoints

| Action    | Method | Endpoint                         |
| --------- | ------ | -------------------------------- |
| Create    | POST   | /collegeManagement/students      |
| Get All   | GET    | /collegeManagement/students      |
| Get By ID | GET    | /collegeManagement/students/{id} |
| Update    | PUT    | /collegeManagement/students/{id} |
| Patch     | PATCH  | /collegeManagement/students/{id} |
| Delete    | DELETE | /collegeManagement/students/{id} |

---

## 🧾 Sample Error Response

```json
{
  "timestamp": "2026-04-08T01:27:28",
  "status": 404,
  "error": "Not Found",
  "message": "Student not found with id: 10",
  "path": "/collegeManagement/students/10"
}
```

---

## ▶️ How to Run the Project

1. Clone the repository

   ```
   git clone https://github.com/your-username/student-management-system-springboot.git
   ```

2. Open in IDE (IntelliJ / Eclipse)

3. Configure PostgreSQL in `application.properties`

   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

4. Run the Spring Boot application

5. Test APIs using Postman
---

## 💡 What I Learned

* Designing RESTful APIs
* Implementing layered architecture (Controller → Service → Repository)
* Using JPA for database operations without writing SQL
* Handling exceptions globally with meaningful responses
* Structuring backend projects for scalability

---

## 👨‍💻 Author

**Jayakrishna**

---

⭐ If you like this project, consider giving it a star!
