import java.util.ArrayList;
import java.util.List;

// Subject interface
interface Subject { //Interface defines methods that allow observers subscribe (attach) and unsubscribe (detach)
    void attach(Observer observer); //as well as notify users 
    void detach(Observer observer);
    void notifyObservers(String event);
}

// ConcreteSubject class implements the subject interface. Maintains a list of observers 
class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String event) {  
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void addEvent(String event) {//When a new event is added the ConcreteSub notifies all registered observers
        System.out.println("New event added: " + event);//by calling their update method
        notifyObservers(event);
    }
}

// Observer interface
interface Observer { //defines the method update to notify the observers of the change
    void update(String event);
}

// ConcreteObserver class
class ConcreteObserver implements Observer {
    private String name; //Implements the observer interface.
//Contains the logic to respond to the notifs from the subject . Simply prints when receiving a notif
    public ConcreteObserver(String name) {
        this.name = name;
    }

    public void update(String event) {
        System.out.println(name + " received notification for event: " + event);
    }
}

// Client code
class User {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        // Create observers
        Observer observer1 = new ConcreteObserver("User1");
        Observer observer2 = new ConcreteObserver("User2");

        // Attach observers to the subject
        subject.attach(observer1);
        subject.attach(observer2);

        // Add a new event
        subject.addEvent("Music Concert");

        // Detach observer1
        subject.detach(observer1);

        // Add another event
        subject.addEvent("Sports Event");
    }
}
