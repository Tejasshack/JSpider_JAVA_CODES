package JAVA_PART_1.non_static;

/**
 * The Static class demonstrates the use of static variables and methods.
 */
public class Static {
    
    // Static variable x, shared across all instances of the class
    static int x = 60;

    /**
     * The test method demonstrates accessing both a local static variable 
     * and a globally defined static variable using the class reference.
     */
    public static void test() {
        // Local variable x, specific to this method
        int x = 75;
        
        // Accessing the local variable x
        System.out.println("Accessing the variable x of Test method: " + x);
        
        // Accessing the globally defined static variable using the class reference
        System.out.println("Accessing globally defined static variable x using class reference: " + Static.x);
    }

    /**
     * The main method is the entry point of the program.
     * It calls the test method to demonstrate static variable usage.
     */
    public static void main(String[] args) {
        System.out.println("Main method execution start");
        
        // Calling the test method
        test();
        
        System.out.println("Main method execution ends");
    }
}
