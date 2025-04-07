
# Object-Oriented Analysis and Design Assignments

This repository contains original implementations of various design patterns as part of the Object-Oriented Analysis and Design (OOAD) coursework. All code was written by **Gauri Shashank Moghe** and demonstrates a clear understanding of software design principles and modeling.


## Repository Structure

```
OOAD/
│
├── Assignment3/
│   ├── Client.java
│   ├── DatabaseManager.java
│   ├── OOAD Assignment 3.pdf
│
├── Assignment4/
│   ├── Client.java
│   ├── User.java
│   ├── OOAD ASSIGNMENT 4.pdf
│
└── README.md
```


## Assignment 3 – Builder and Singleton Pattern

### 1. Singleton Pattern – `DatabaseManager.java`
Implements the Singleton pattern to ensure a single instance of a database connection is shared across the system. This design ensures resource efficiency, data consistency, and centralized control.

### 2. Builder Pattern – `Client.java`
Uses Joshua Bloch's Builder pattern to create `Event` objects with a flexible set of optional parameters. The builder offers a clean and readable way to construct objects with multiple configurations.

Diagrams and detailed explanation are included in `OOAD Assignment 3.pdf`.


## Assignment 4 – Proxy and Observer Pattern

### 1. Proxy Pattern – `Client.java`
Implements a `TicketProxy` that acts as a security gatekeeper to the real ticket system. This adds an authentication layer before allowing ticket purchases.

### 2. Observer Pattern – `User.java`
Implements an event subscription model where users (observers) are notified when new events are added. Demonstrates loose coupling between subjects and observers using interfaces.

Diagrams and written explanations are available in `OOAD ASSIGNMENT 4.pdf`.



## Author

**Gauri Shashank Moghe**  

## License

This project is released under the [MIT License](https://opensource.org/licenses/MIT).
