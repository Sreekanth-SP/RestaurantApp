# RestaurantApp 
---
### Framework and Languages Used
* **Framework:** Spring Boot (MVC)
* **Languages:** Java
---

### Project Summary

> The Restaurant App is a Spring Boot project developed using the MVC architecture. It aims to provide a web-based platform for managing and interacting with a restaurant's information and menu.
---
### Data Flow

* The user interacts with the application through a web browser or POSTMAN.
* The user's request is received by the Spring Boot application.
* The request is then routed to the appropriate controller based on the specified API.
* The controller processes the request and interacts with the appropriate services.
* The services handle the business logic, which may involve accessing a database or performing other operations.
* The services retrieve or update data from the database using repositories.
* Once the necessary operations are completed, the response is generated and returned to the user.
---
## Data Structure Used:
The data structure used in the Restaurant App project depends on the specific requirements and entities involved. However, commonly used data structures in a restaurant management application may include:

* Restaurant: Represents a restaurant and its attributes such as name, address, and contact information.
* Speciality: Represents the menu of a restaurant and contains a collection of MenuItem objects.
* These data structures can be defined as Java classes using appropriate annotations and mapped to database tables using Spring Data JPA.ArrayList is used to count the restaurants.
---

## Dependencies Used:
The following dependencies are used in this project:

* Spring Starter Web: This dependency provides the necessary libraries for building web applications with Spring MVC.
* Lombok: Lombok is a Java library that helps reduce boilerplate code by automatically generating getters, setters, constructors, and other common methods.
---
