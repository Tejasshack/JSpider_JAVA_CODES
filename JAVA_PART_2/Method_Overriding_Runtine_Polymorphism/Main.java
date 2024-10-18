package JAVA_PART_2.Method_Overriding_Runtine_Polymorphism;

public class Main {
    public static void main(String[] args) {

        // Parent class reference to the parent class object
        Shape shape = new Shape();
        
        shape.area();  // Calls Shape's area()

        // Parent class reference to the child class object (runtime polymorphism)
        Shape circle = new Circle();
        circle.area();  // Calls Circle's overridden area()
    }
}
