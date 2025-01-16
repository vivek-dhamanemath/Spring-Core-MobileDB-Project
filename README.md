# Spring Project Layers

This project demonstrates a simple Spring application with multiple layers including Controller, Service, and Repository. The application manages mobile entities with basic CRUD operations.

## Project Structure

- `App.java`: The main class to run the application.
- `MobileControler.java`: The controller class to handle user inputs and call service methods.
- `MobileService.java`: The service class to handle business logic.
- `MobileRepository.java`: The repository class to interact with the database.
- `Mobile.java`: The entity class representing a mobile.

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
