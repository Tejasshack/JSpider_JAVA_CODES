package JAVA_PART_1.non_static;

/**
 * The Non_Static class demonstrates the use of non-static variables and methods.
 */
class Non_Static {

    // Non-static global variable
    int x = 12; // This variable is an instance variable

    /**
     * The start method prints messages to demonstrate accessing 
     * both a local variable and a non-static global variable.
     */
    public void start() {
        System.out.println("Start method");

        // Declaring a local variable x
        int x = 60;
        // Accessing the local variable x
        System.out.println("This will access local variable x declared inside method start: " + x);

        // Accessing the non-static global variable using 'this' keyword
        System.out.println("Accessing non-static global variable by using 'this' keyword: " + this.x);
    }

    /**
     * The main method is the entry point of the program.
     * It creates an instance of Non_Static and calls the start method.
     */
    public static void main(String[] args) {
        // Creating an instance of the Non_Static class
        Non_Static n1 = new Non_Static();

        // Accessing the non-static global variable through the object n1
        System.out.println("This global non-static variable is accessed by using object creation: " + n1.x); 

        // Calling the start method using the created object
        n1.start();
    }
}
