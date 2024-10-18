package JAVA_PART_2.Method_Overriding_Runtine_Polymorphism;

public class Circle extends Shape {

    // Overriding the area method to provide specific implementation for Circle
    @Override
    public void area() {
        System.out.println("The Area of Circle is: PI * R * R");
        System.out.println("This is working");
    }
}
