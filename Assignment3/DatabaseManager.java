//CODE FOR THE SINGLETON PATTERN
import java.io.*;

class Database{
    //static member used to hold the single instance
    private static Database instance;
    
    //Making the contructor private
    private Database()
    {
        System.out.println("Establishing database connection");
    }

    public static synchronized Database getInstance(){
        //Chceking if the instance exists
        if(instance==null)
        {
            //If there is no instance create a new one
            instance = new Database();
        }

        //Return the instance
        return instance;
    }

    public static void getConnection(String user)
    {
        System.out.println(" Connecting "+ user);
    }
}

class DatabaseManager{
    public static void main(String[] args)
    {
        Database db = Database.getInstance();
        db.getConnection("User 1");
    }
}