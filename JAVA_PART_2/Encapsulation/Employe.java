package JAVA_PART_2.Encapsulation;

public class Employe {
    // Private fields for encapsulation
    private String name;
    private int age;
    private String location;

    // Default constructor
    Employe() {
    }

    // Parameterized constructor to initialize fields
    Employe(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    // Getter method for 'name'
    public String getName() {
        return this.name;
    }

    /*
     * Use This Method of getter creation when data member is defined with static
     * keyword.
     * Example of static getter:
     * 
     * private static String name;
     * public static String getName() {
     *   return name;
     * }
     */

    // Getter method for 'age'
    public int getAge() {
        return this.age;
    }

    // Getter method for 'location'
    public String getLocation() {
        return this.location;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for 'age'
    public void setAge(int age) {
        this.age = age;
    }

    // Setter method for 'location'
    public void setLocation(String location) {
        this.location = location;
    }

    // Override toString method for a meaningful string representation of an Employe object
    @Override
    public String toString() {
        return "Employe{name='" + name + "', age=" + age + ", location='" + location + "'}";
    }
}
