package JAVA_PART_2.Abstract_Methods;
public class Car extends Vehicle {

    // Default constructor
    Car() {}

    // Parameterized constructor
    Car(String name, String price) {
        super(name, price);  // Call the parent constructor
    }

    // Implement the abstract methods
    @Override
    public void brake() {
        System.out.println(name + " applies hydraulic brakes.");
    }

    @Override
    public void openDoor() {
        System.out.println(name + " opens the door manually.");
    }
}
