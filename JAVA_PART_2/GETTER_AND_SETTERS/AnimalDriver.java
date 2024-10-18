package JAVA_PART_2.GETTER_AND_SETTERS;

// The AnimalDriver class extends Animal and demonstrates the usage of getter and setter methods.
public class AnimalDriver extends Animal {

    public static void main(String[] args) {

        // Creating an instance of the Animal class.
        Animal a1 = new Animal();

        // Setting values for the animal's properties using setter methods.
        a1.setname("Lion");                // Setting the name of the animal to "Lion".
        a1.settypeOfAnimal("Carnivorous");  // Setting the type of the animal to "Carnivorous".
        a1.setisDangerous(true);            // Setting whether the animal is dangerous to 'true'.

        // Retrieving and printing the values using getter methods.
        System.out.println(a1.getname());           // Prints: Lion
        System.out.println(a1.gettypeOfAnimal());   // Prints: Carnivorous
        System.out.println(a1.getisDangerous());    // Prints: true
    }
}
