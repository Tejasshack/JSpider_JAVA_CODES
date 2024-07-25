package JAVA_PART_1.non_static;

public class Static {
    static int x = 60;

    public static void test(){
        int x = 75;
        System.out.println("Accessing the variable x of Test method::=>"+x);
        System.out.println("Accessing Globally defined static variable x using class reference::=>" +Static.x);
    }

    public static void main(String[] args) {
        System.out.println("Main method execution start");
        test();
        System.out.println("Main method execution ends");
    }
}
