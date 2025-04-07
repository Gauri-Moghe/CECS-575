# Assignment 3

This assignment demonstrates the use of two essential design patterns in object-oriented programming:

- **Singleton Pattern** – Ensures a single shared instance of a database connection  
- **Builder Pattern** – Provides a flexible way to construct complex `Event` objects


## Files

| File                  | Description |
|-----------------------|-------------|
| `DatabaseManager.java` | Singleton pattern implementation for database access |
| `Client.java`          | Builder pattern implementation for constructing event details |
| `OOAD Assignment 3.pdf`| Report with class diagrams and explanations |


## Design Patterns Used

### Singleton Pattern
- Ensures that only one instance of the `Database` class exists.
- Centralizes connection access and avoids redundant objects.
- Implemented with a private constructor and a static `getInstance()` method.

### Builder Pattern
- Used to create an `Event` object with optional parameters in a readable, fluent style.
- Implements the Builder class as a static inner class of `Event`.



## How to Run

Compile and run each Java file separately using your favorite IDE or from terminal:

```bash
javac DatabaseManager.java
java DatabaseManager

javac Client.java
java Client
