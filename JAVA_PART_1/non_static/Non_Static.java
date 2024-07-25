package JAVA_PART_1.non_static;

class Non_Static {

    int x = 12;

    public void start() {
        System.out.println("Start method");
        int x = 60;
        System.out.println("This will Access local variable x Declared inside method start ::" +x);

        //Accessing the global non static variable inside method using this keyword
        System.out.println("Accessing non static global variable by using this keyword ::"+this.x);
    }

    public static void main(String[] args) {
        Non_Static n1 = new Non_Static();
        System.out.println("This Global non static variable is accessed by using object creation::"+n1.x); // We can access non static variables by creating class

        n1.start();

    }
}