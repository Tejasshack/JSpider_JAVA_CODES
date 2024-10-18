package JAVA_PART_2.Encapsulation;

public class Main {

    public static void main(String[] args) {

        // Creating an Employe object with the parameterized constructor
        Employe e1 = new Employe("Tejaswi", 21, "Meerut");

        // Creating an Employe object using the default constructor
        Employe e2 = new Employe();

        // Displaying the details of e1 using the overridden toString() method
        System.out.println(e1);

        // Setting values for e2 using setter methods
        e2.setName("Ruchi");
        e2.setAge(21);
        e2.setLocation("Meerut");

        // Accessing and displaying the values of e1 using getter methods
        System.out.println("Name: " + e1.getName());
        System.out.println("Age: " + e1.getAge());
        System.out.println("Location: " + e1.getLocation());

        // Accessing and displaying the values of e2 using getter methods
        System.out.println("Name: " + e2.getName());
        System.out.println("Age: " + e2.getAge());
        System.out.println("Location: " + e2.getLocation());
    }
}
