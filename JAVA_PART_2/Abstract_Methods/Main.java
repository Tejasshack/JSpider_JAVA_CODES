package JAVA_PART_2.Abstract_Methods;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Car
        Car myCar = new Car("Toyota", "20000");
        myCar.start();      // Starting the car
        myCar.drive();      // Driving the car
        myCar.brake();      // Applying the brakes
        myCar.openDoor();   // Opening the door

        // Creating an instance of ElectricCar
        ElectricCar tesla = new ElectricCar("Tesla Model 3", "35000");
        tesla.start();      // Starting the electric car
        tesla.drive();      // Driving the electric car
        tesla.brake();      // Applying the brakes
        tesla.openDoor();   // Opening the door of the electric car

        // Creating a Vehicle reference to a Car object
        Vehicle v1 = new Car("Supra", "9999999");
        v1.start();         // Starting the vehicle (Car)
        v1.drive();         // Driving the vehicle (Car)
        v1.brake();         // Applying the brakes to the vehicle (Car)
    }
}
