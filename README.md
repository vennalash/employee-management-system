# Employee Management System

A web-based Employee Management System built using Java, Spring Boot, MySQL, and HTML, CSS, and JavaScript. The application helps manage employee records through a simple dashboard.

## Features

- Add new employees
- View all employee records
- Update employee details
- Delete employee records
- Search employees by name or department
- Filter by department and salary
- Sort employees by name and salary
- Pagination for employee records
- Dashboard with employee statistics
- Export employee data to CSV
- Input validation and exception handling

## Technologies Used

- **Backend:** Java, Spring Boot
- **Database:** MySQL
- **Persistence:** Spring Data JPA, Hibernate
- **Frontend:** HTML, CSS, JavaScript
- **Build Tool:** Maven
- **IDE:** Eclipse
- **Version Control:** Git and GitHub

## Prerequisites

Make sure you have the following installed:

- Java 21
- MySQL 8
- Git

## Setup and Installation

### 1. Clone the repository

```bash
git clone https://github.com/vennalash/employee-management-system.git
cd employee-management-system
```

### 2. Create the database

Open MySQL and run:

```sql
CREATE DATABASE employee_db;
```

### 3. Configure database credentials

Set the `DB_USERNAME` and `DB_PASSWORD` environment variables to match your local MySQL credentials.

Check `src/main/resources/application.properties` before running the application. Never commit actual passwords or secrets.

### 4. Run the application

On Windows, open Command Prompt in the project folder and run:

```bash
mvnw.cmd spring-boot:run
```

Alternatively, import the project into Eclipse as a Maven project and run `EmployeeManagementApplication.java`.

### 5. Open the application

Visit:

http://localhost:8081/

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/employees` | Add an employee |
| GET | `/employees` | Get all employees |
| GET | `/employees/{id}` | Get an employee by ID |
| PUT | `/employees/{id}` | Update an employee |
| DELETE | `/employees/{id}` | Delete an employee |
| GET | `/employees/page?page=0&size=5` | Get paginated employees |

## Future Enhancements

- User authentication and authorization
- Improved dashboard visualizations
- Automated testing
- Deployment to a cloud platform

## Author

**Vennala S H**

GitHub: [@vennalash](https://github.com/vennalash)
