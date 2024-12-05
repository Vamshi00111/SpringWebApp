# Spring E-Commerce Application

A comprehensive Spring Boot application for an e-commerce platform, demonstrating the use of Spring MVC, Spring Data JPA, and Spring Security. The project is structured to showcase best practices in dependency injection, service-oriented architecture, and data management.

## Key Features

### Dependency Injection & Inversion of Control (IoC)
- Uses Spring's **IoC container** to manage beans and dependencies.
- Demonstrates field, constructor, and setter injection.
- Includes examples of `@Autowired`, `@Qualifier`, and `@Primary` annotations.

### Application Layers
1. **Controller Layer**:
   - Handles HTTP requests and responses using `@RestController`, `@RequestMapping`, and related annotations.
   - Example: `HomeController` for greeting messages and managing endpoints.
   
2. **Service Layer**:
   - Contains business logic classes.
   - Example: `ProductService` manages product-related operations like fetching and filtering.

3. **Repository Layer**:
   - Implements data persistence using Spring Data JPA.
   - Uses Hibernate for ORM and demonstrates the use of `@Query` for custom JPQL queries.

### Spring MVC Architecture
- Handles both layout and data transfers.
- Front Controller maps incoming HTTP requests to the appropriate handler methods.

### Database Management
- Configured with **H2 Database** for lightweight, in-memory persistence during development.
- Demonstrates Spring Boot's `application.properties` for database and server configuration.

### Security
- Utilizes **Spring Security** for authentication and access control.
- Includes examples of session management and filters for secure data handling.

### REST API Endpoints
- Implements `@GetMapping`, `@PostMapping`, and other HTTP method annotations.
- Example: `/products` endpoint to retrieve all products or search by ID.

### Additional Features
- **Cross-Origin Resource Sharing (CORS)**: Uses `@CrossOrigin` to allow requests from different domains.
- **Error Handling**: Demonstrates the use of `ResponseEntity` for sending HTTP status codes alongside responses.

### Libraries and Tools
- **Lombok**: Reduces boilerplate code for getters, setters, and constructors.
- **Jackson**: Facilitates JSON serialization and deserialization.

## How to Run
1. Clone the repository:
2. Navigate to the project directory:
3. Build the application:
4. Run the application:
5. Access the application at [http://localhost:8080](http://localhost:8080).

## Configuration
Modify `application.properties` for custom configurations:
```properties
server.port=8081
spring.datasource.url=jdbc:h2:mem:testDB
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.show-sql=true
