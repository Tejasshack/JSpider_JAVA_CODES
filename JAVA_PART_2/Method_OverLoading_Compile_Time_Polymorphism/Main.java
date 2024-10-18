package JAVA_PART_2.Method_OverLoading_Compile_Time_Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Testing addition methods (Overloaded for different data types)
        System.out.println("Addition:");
        System.out.println("5 + 10 = " + calculator.add(5, 10)); // Adds two integers
        System.out.println("5 + 10 + 15 = " + calculator.add(5, 10, 15)); // Adds three integers
        System.out.println("5.5 + 10.5 = " + calculator.add(5.5, 10.5)); // Adds two doubles

        // Testing subtraction methods (Overloaded for different data types)
        System.out.println("\nSubtraction:");
        System.out.println("10 - 5 = " + calculator.subtract(10, 5)); // Subtracts two integers
        System.out.println("10.5 - 5.5 = " + calculator.subtract(10.5, 5.5)); // Subtracts two doubles

        // Testing multiplication methods (Overloaded for different data types)
        System.out.println("\nMultiplication:");
        System.out.println("5 * 10 = " + calculator.multiply(5, 10)); // Multiplies two integers
        System.out.println("5.5 * 2.0 = " + calculator.multiply(5.5, 2.0)); // Multiplies two doubles

        // Testing division methods (Overloaded for different data types)
        System.out.println("\nDivision:");
        System.out.println("10 / 2 = " + calculator.divide(10, 2)); // Divides two integers
        System.out.println("10.0 / 4.0 = " + calculator.divide(10.0, 4.0)); // Divides two doubles

        // Testing maximum value methods (Overloaded for different data types)
        System.out.println("\nMaximum:");
        System.out.println("Max of 10 and 20: " + calculator.max(10, 20)); // Finds max of two integers
        System.out.println("Max of 10.5 and 7.5: " + calculator.max(10.5, 7.5)); // Finds max of two doubles
        
        // Testing division by zero (This will throw an ArithmeticException)
        try {
            System.out.println("10 / 0 = " + calculator.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage()); // Handling the exception and displaying the error
        }
    }
}
