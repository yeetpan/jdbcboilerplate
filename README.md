# JDBC Boilerplate Guide

This project demonstrates the basic JDBC (Java Database Connectivity) boilerplate setup required to connect and interact with a MySQL database using raw SQL queries in Java.

---

##  JDBC Boilerplate Structure

A typical JDBC application includes the following components:

1. **Database Connection Setup**
   - Define constants for DB URL, username, and password.
   - Use `DriverManager.getConnection()` to establish the connection.

2. **SQL Execution**
   - Use `Statement` (or `PreparedStatement`) to execute SQL queries like `SELECT`, `INSERT`, `UPDATE`, `DELETE`.
   - Use `ResultSet` to iterate through results of `SELECT` queries.

3. **Exception Handling**
   - Use `try-catch` blocks to handle `SQLException` and report DB errors cleanly.

4. **Resource Management**
   - In minimal setups, close the `Connection`, `Statement`, and `ResultSet` manually or allow JVM cleanup.
   - In production, always prefer `try-with-resources`.

---

##  Basic Template to Follow

- Define `url`, `username`, and `password` at the top as constants.
- Wrap all JDBC operations inside a `try-catch` block.
- Reuse the same `Statement` object for multiple queries.
- Format SQL strings using `String.format()` (or switch to `PreparedStatement` for safety).
- Handle each operation (SELECT, INSERT, UPDATE, DELETE) sequentially as needed.
- Keep the code readable by avoiding unnecessary abstraction if working on small or learning-based projects.

---

##  Project Highlights

- Demonstrates full CRUD (Create, Read, Update, Delete) operations.
- Uses direct SQL formatting (for learning purposes).
- Emphasizes code clarity over abstraction.
- Matches closely with how JDBC is taught in early backend projects or college-level assignments.

---

##  Security Note

For real applications:
- Do not hardcode credentials — use environment variables or config files.
- Use `PreparedStatement` instead of `String.format()` to avoid SQL injection.

---

##  Prerequisites

- Java 8+
- MySQL Server running on `localhost:3306`
- Database `mydb` with a `students` table (id, name, age, marks)

---
