//CODE FOR JOSHUA BLOCH'S BUILDER DESIGN PATTERN
import java.util.Date;

//Event class
class Event {
    private String title;
    private Date dateTime;
    private String location;
    private String description;
    private double ticketPrice;
    private int capacity;
    private String seatingArrangement;

    private Event(Builder builder) {
        this.title = builder.title;
        this.dateTime = builder.dateTime;
        this.location = builder.location;
        this.description = builder.description;
        this.ticketPrice = builder.ticketPrice;
        this.capacity = builder.capacity;
        this.seatingArrangement = builder.seatingArrangement;
    }

    //Getter methods
    public String getTitle() {
        return title;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getSeatingArrangement() {
        return seatingArrangement;
    }

    //EventBuilder class
    public static class Builder {
        //Required parameters
        private String title;
        private Date dateTime;

        //Optional parameters
        private String location = "Default Location";
        private String description = "";
        private double ticketPrice = 0.0;
        private int capacity = 0;
        private String seatingArrangement = "";

        //Constructor with required parameters
        public Builder(String title, Date dateTime) {
            this.title = title;
            this.dateTime = dateTime;
        }

        //Setter methods for optional parameters
        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setTicketPrice(double ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }

        public Builder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setSeatingArrangement(String seatingArrangement) {
            this.seatingArrangement = seatingArrangement;
            return this;
        }

        //Build method to create the Event object
        public Event build() {
            return new Event(this);
        }
    }
}

// Client code
class Client {
    public static void main(String[] args) {
        //Creating the Event using Builder pattern
        Event event = new Event.Builder("XYZ Event", new Date())
                            .setDescription("Event Description")
                            .setTicketPrice(25.0)
                            .setCapacity(100)
                            .setSeatingArrangement("Theater Style")
                            .build();

      
        System.out.println("Event Title: " + event.getTitle());
        System.out.println("Event Date and Time: " + event.getDateTime());
        System.out.println("Event Location: " + event.getLocation());
        System.out.println("Event Description: " + event.getDescription());
        System.out.println("Event Ticket Price: " + event.getTicketPrice());
        System.out.println("Event Capacity: " + event.getCapacity());
        System.out.println("Event Seating Arrangement: " + event.getSeatingArrangement());
    }
}
