package JAVA_PART_2.Method_OverLoading_Compile_Time_Polymorphism;

public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method: Takes String input and returns Integer output after parsing
    public int add(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    // Overloaded method: Adds three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method: Adds two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Overloaded method: Subtracts two doubles
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Overloaded method: Multiplies two doubles
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two integers with error handling for division by zero
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    // Overloaded method: Divides two doubles with error handling for division by zero
    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Method to find the maximum of two integers
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Overloaded method: Finds the maximum of two doubles
    public double max(double a, double b) {
        return (a > b) ? a : b;
    }

}
