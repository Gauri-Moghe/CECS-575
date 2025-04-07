
# Assignment 4

This assignment explores two additional design patterns that help enforce security and modular event-driven behavior:

- **Proxy Pattern** – Adds an authentication layer before accessing the core ticketing system  
- **Observer Pattern** – Enables automatic notifications to users subscribed to event updates


## Files

| File               | Description |
|--------------------|-------------|
| `Client.java`       | Proxy pattern implementation for securing ticket purchasing |
| `User.java`         | Observer pattern implementation for event notifications |
| `OOAD ASSIGNMENT 4.pdf` | Report with class and sequence diagrams for both patterns |


## Design Patterns Used

### Proxy Pattern
- The `TicketProxy` class acts as a gatekeeper to the real `TicketSystem`.
- Adds a user authentication step before calling the real `purchaseTicket()` method.
- Demonstrates how access control and logic separation can be implemented using the proxy pattern.

### Observer Pattern
- Allows multiple users (observers) to receive notifications when new events are added.
- The `ConcreteSubject` class maintains a list of observers and notifies them upon changes.
- Demonstrates the decoupling of publishers and subscribers using `Observer` and `Subject` interfaces.


## How to Run

Compile and run the files individually using an IDE or from terminal:

```bash
javac Client.java
java Client

javac User.java
java User
