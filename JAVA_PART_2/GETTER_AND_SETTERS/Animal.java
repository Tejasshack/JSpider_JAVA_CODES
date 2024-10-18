package JAVA_PART_2.GETTER_AND_SETTERS;

// The Animal class represents a general animal with properties such as name, type, and whether it is dangerous.
public class Animal {
    
    // Private instance variables for encapsulation.
    private String name;
    private String typeOfAnimal;
    private Boolean isDangerous;

    // Getter method for the name property.
    // This allows other classes to access the name of the animal.
    public String getname(){
        return name;
    }

    // Getter method for the typeOfAnimal property.
    // This allows other classes to access the type of the animal (e.g., mammal, reptile).
    public String gettypeOfAnimal(){
        return typeOfAnimal;
    }

    // Getter method for the isDangerous property.
    // This allows other classes to check whether the animal is dangerous.
    public Boolean getisDangerous(){
        return isDangerous;
    }

    // Setter method for the name property.
    // This allows other classes to modify the name of the animal.
    public void setname(String name){
        this.name = name;
    }

    // Setter method for the typeOfAnimal property.
    // This allows other classes to modify the type of the animal.
    public void settypeOfAnimal(String typeOfAnimal){
        this.typeOfAnimal = typeOfAnimal;
    }

    // Setter method for the isDangerous property.
    // This allows other classes to set whether the animal is dangerous.
    public void setisDangerous(Boolean isDangerous){
        this.isDangerous = isDangerous;
    }
}
