# 🛒 E-commerce Backend System

Welcome to the **E-commerce Inventory Management System**, a Java Spring Boot project designed to manage products, customers, categories, and orders for a retail platform. This backend offers modular and maintainable structure with clean separation between controllers, services, repositories, and entities.

---

## ✨ Key Highlights

- 🎯 **Product Management**: Add, update, and manage products, including low-stock filtering.
- 🧾 **Order Processing**: Create orders with multiple items, subtotal/total calculation, payment & order status tracking.
- 👤 **Customer Management**: Register, view, update, and delete customers.
- 🗂️ **Category Support**: Assign and organize products by category.
- 🧠 **DTO & Mapping**: Clean data handling using DTOs with `ModelMapper` and `MapStruct`.
- 🔐 **Spring Security Configured**: Default open endpoints, ready for JWT or role-based protection.
- 🧩 **Enum Status**: Clearly defined states for orders and payments.
- 🕓 **Timestamps**: Auto-tracked creation and updates using Hibernate.

---

## 📚 Modules at a Glance

| Module        | Purpose                              |
|---------------|---------------------------------------|
| `Controller`  | Handles REST API endpoints            |
| `Service`     | Contains business logic               |
| `Repository`  | Interfaces with the database          |
| `Dto`         | Defines data transfer structures      |
| `Entity`      | JPA entity mappings                   |
| `Mapper`      | Maps DTOs to Entities and vice versa |
| `Enums`       | Defines order & payment status        |
| `Config`      | Sets up Spring Security               |

---

## 🧾 Core Functionalities

### 📦 Products
- Add, update, and delete products
- Get product by ID
- Filter products by low stock

### 👤 Customers
- Register new customers
- Get customer by ID
- List all customers
- Delete customer

### 📑 Orders
- Place an order with multiple items
- Subtotal and total price calculations
- Assign customer and payment status

### 🗃️ Categories
- Create and list product categories

---

## 🔐 Security

Security configuration is prepared using `SecurityFilterChain`. Currently, all endpoints are **open to the public** using `permitAll()` — ideal for testing. Easily extendable to JWT, OAuth2, or role-based access.

---

## 🔖 Enum Statuses

- **OrderStatus**: `NEW`, `PROCESSING`, `SHIPPED`, `DELIVERED`, `CANCELLED`
- **PaymentStatus**: `PENDING`, `PAID`, `FAILED`, `REFUNDED`

---

## 👩‍💻 Author

**Nela-2005**  
📧 enela23@epoka.edu.al  
🔗 [GitHub Profile](https://github.com/Nela-2005)

---
