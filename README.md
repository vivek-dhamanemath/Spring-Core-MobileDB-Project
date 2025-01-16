# Spring Project Layers

This project demonstrates a simple Spring application with multiple layers including Controller, Service, and Repository. The application manages mobile entities with basic CRUD operations.

## Project Structure

- `App.java`: The main class to run the application.
- `MobileControler.java`: The controller class to handle user inputs and call service methods.
- `MobileService.java`: The service class to handle business logic.
- `MobileRepository.java`: The repository class to interact with the database.
- `Mobile.java`: The entity class representing a mobile.

## Layers

### Controller Layer

- **MobileControler.java**: This layer handles the user inputs and interacts with the service layer. It contains methods to add, find, update, delete, and list all mobiles.

### Service Layer

- **MobileService.java**: This layer contains the business logic of the application. It interacts with the repository layer to perform CRUD operations. Methods include:
  - `addMobile()`: Adds a new mobile.
  - `findMobileById()`: Finds a mobile by its ID.
  - `updateMobile()`: Updates an existing mobile.
  - `deleteMobile()`: Deletes a mobile by its ID.
  - `findAllMobile()`: Lists all mobiles.

### Repository Layer

- **MobileRepository.java**: This layer interacts with the database using JPA. It contains methods to perform CRUD operations on the mobile entity. Methods include:
  - `addMobile(Mobile mobile)`: Adds a new mobile to the database.
  - `findMobileById(int mobileId)`: Finds a mobile by its ID.
  - `updateMobile(Mobile mobile)`: Updates an existing mobile.
  - `deleteMobile(int mobileId)`: Deletes a mobile by its ID.
  - `findAllMobile()`: Lists all mobiles.

### Entity Layer

- **Mobile.java**: This is the entity class representing a mobile. It contains fields like `mobileId`, `mobileModel`, `mobileBrand`, and `mobilePrice`.

## How to Run

1. **Setup Database Configuration**: Ensure you have a MySQL database configured and update the `persistence.xml` file with your database details.

2. **Run the Application**: Execute the `App.java` class. You will be prompted with options to perform various operations.

## Operations

The application supports the following operations:

1. **Add Mobile**: Add a new mobile to the database.
2. **Find Mobile by ID**: Retrieve a mobile by its ID.
3. **Update Mobile**: Update the details of an existing mobile.
4. **Delete Mobile**: Delete a mobile by its ID.
5. **Find All Mobiles**: List all mobiles in the database.
6. **Exit**: Exit the application.

## Example Usage

When you run the application, you will see a menu with options. Enter the corresponding number to perform an operation. For example:

```
Choose an option:
1. Add Mobile
2. Find Mobile by ID
3. Update Mobile
4. Delete Mobile
5. Find All Mobiles
6. Exit
```

## Dependencies

- Spring Framework
- JPA (Java Persistence API)
- MySQL

## Notes

- Ensure your database is running and accessible.
- Update the database configuration in `persistence.xml` before running the application.

## License

This project is licensed under the MIT License.
