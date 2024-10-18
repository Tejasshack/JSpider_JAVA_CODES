package JAVA_PART_2.Abstract_Methods;

/* Abstract class Points
 * If we declare a class with abstract keyword then we cannot instantiate its object
 * Inside and abstract class we can have Both abstract and concrete methods
 * 
 * * Abstract Methods :- Are those methods which are defined with abstract word and also they are just function defination
 * * To complete the implementation we need child/sub class to OVERRIDE THE METHODS
 * * Also Abstract Methods are only allowed inside abstract class and it can also contain concrete methods
 * 
 * * Concrete methods :- These type of methods are not defined with abstract keyword 
 * * They can be have Method body and complete implementation of method
 * * They are allowed inside normal class as well as abstract class
 * 
 * 
 * * Can a Abstract class can have a constructor???
 * * * Yes ,Abstraction can have constructor , If we have defined non static methods then we can create constructor
 * 
 * * *  Abstract class can be extended by another class 
 */

public abstract class Vehicle {

    // Attributes to hold the name and price of the vehicle
    String name;
    String price;

    // Default constructor
    Vehicle() {
    }

    // Parameterized constructor to initialize name and price
    Vehicle(String name, String price) {
        this.name = name;
        this.price = price;
    }

    // Abstract method for braking functionality
    public abstract void brake(); // Subclasses must provide implementation

    // Abstract method for opening the vehicle's door
    public abstract void openDoor(); // Subclasses must provide implementation

    // Concrete method to simulate driving the vehicle
    public void drive() {
        System.out.println("Drive the Car");
    }

    // Concrete method to simulate starting the vehicle
    public void start() {
        System.out.println("Start The Car");
    }
}