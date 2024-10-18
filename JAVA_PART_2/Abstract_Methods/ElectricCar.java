package JAVA_PART_2.Abstract_Methods;


public class ElectricCar extends Vehicle {

    // Default constructor
    ElectricCar() {}

    // Parameterized constructor
    ElectricCar(String name, String price) {
        super(name, price);  // Call the parent constructor
    }

    // Implement the abstract methods
    @Override
    public void brake() {
        System.out.println(name + " uses regenerative braking.");
    }

    @Override
    public void openDoor() {
        System.out.println(name + " has automatic doors.");
    }
}
