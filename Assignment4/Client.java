// Interface for TicketSystem
interface TicketSystem {
    void purchaseTicket(); //This is the interface for the real subject RealTicketSystem
}

// Real TicketSystem implementation
class RealTicketSystem implements TicketSystem { //The real subject, represents the real object, provides actual implementation of purchasing the ticket
    public void purchaseTicket() {
        System.out.println("Ticket purchased successfully");
    }
}

// Proxy for TicketSystem
class TicketProxy implements TicketSystem { //The proxy class implements the interface acts as a surrogate or place holder
    private RealTicketSystem ticketSystem; // for RealTicketSystem 

    public TicketProxy() {
        this.ticketSystem = new RealTicketSystem();
    }

    private boolean authenticateUser() {
        // Perform user authentication logic before implementing the real system,  checks if the user has the necessary permissions to perform the operation
        return true; // Dummy authentication for demonstration
    }

    public void purchaseTicket() {  //If the user authentication is successful then TicketProxy forwards purchaseTicket to RealTicketSystem
        if (authenticateUser()) {
            ticketSystem.purchaseTicket();
        } else {
            System.out.println("User authentication failed. Cannot purchase ticket.");
        }
    }
}

// Client code
class Client {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketProxy();
        ticketSystem.purchaseTicket();
    }
}
