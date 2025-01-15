# E-Commerce REST API

This project is a RESTful API for managing e-commerce product data, built using the Spring Framework. It provides endpoints for retrieving, creating, updating, and deleting product information.

## Features

- **CRUD operations for product management:**
  - Fetch all products.
  - Add new products.
  - Update existing products.
  - Delete products by ID.
  
- **Welcome and about pages** for basic interaction with the API.
- Built with **Spring Boot** and **Spring Web** for scalable and efficient RESTful services.
- Object-relational mapping with **Spring Data JPA**.
- **H2 database** for data storage and testing.
- API tested using **Postman**.

## Technologies Used

- **Spring Boot**: Framework for building the application.
- **Spring Web**: For developing RESTful APIs.
- **Spring Data JPA**: For object-relational mapping.
- **H2 Database**: In-memory database for testing and development.
- **Postman**: Tool for testing API endpoints.

## Endpoints

### `GET /home`
- **Returns**: "Welcome to Java World"
- **Description**: A simple welcome message to test the API.

### `GET /about`
- **Returns**: "Welcome we are learning and in the about page".
- **Description**: Provides basic details about the project.

### `GET /products`
- **Returns**: A list of all products with details like ID, name, and price.
- **Description**: Fetches all the products from the database.

### `POST /products`
- **Body**: JSON containing product details (e.g., `{"prodId": 1, "prodName": "Product A", "price": 100}`)
- **Description**: Adds a new product to the database.

### `PUT /products`
- **Body**: JSON containing updated product details or a new product (e.g., `{"prodId": 1, "prodName": "Updated Product", "price": 150}`)
- **Description**: Updates an existing product or adds a new product if it doesn’t already exist.

### `DELETE /products`
- **Query Parameter**: `prodId` (e.g., `/products/101 --> /products/{prodId}`)
- **Description**: Deletes the product with the given ID from the database.

## How It Works

- **Retrieve Product Data**: Use `/products` with `GET` to fetch all product details.
- **Add or Update Products**: Use `/products` with `POST` or `PUT` to manage products.
- **Delete Products**: Use `/products` with `DELETE` to remove a product by its ID.
- **Database**: All product data is stored and managed using the H2 database.
- **Testing**: API functionality is verified using Postman.

## Example Request

### Add Product
```bash
POST /products
{
  "prodId": 101,
  "prodName": "Acer Laptop",
  "price": 44000
}
