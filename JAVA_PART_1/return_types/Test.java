package JAVA_PART_1.return_types;

public class Test {

    // Example of a method with a return type that is incorrectly implemented
    // public static void run() {
    //     if (condition) {
    //         // Missing return statement in some cases
    //     }                 
    //     return 30; // This line will throw an error because the method has a void return type
    // }

    // Method with an int return type, correctly implemented
    public static int test(int value) {
        if (value == 2) {
            // Return 1 if the value is 2
            return 1;
        } else {
            // Return 0 for any other value
            return 0;
        }
    }

    // Another method with an int return type, correctly implemented
    public static int demo(int value) {
        if (value == 2) {
            // Return 1 if the value is 2
            return 1;
        }
        // Return the input value if it is not 2
        return value;
    }

    // Method with a void return type, correctly implemented
    public static void test() {
        System.out.println("Hello");
        // Return is optional in void methods and it is fine to use
        return; 
    }

    public static void main(String[] args) {
        // Call the test method with an integer argument and store the result
        int result = test(2);
        // Print the result of the test method
        System.out.println(result);
        
        // Call the test method with no arguments (void method)
        test();
    }
}
