package JAVA_PART_1.return_types;

public class Test {

    // public static void run(){
    //     if (condition) {
            
    //     }                 // This will throw error as if does not return any thing

    //     return 30;
    // }
    
    
    public static int test(int value){
        if (value == 2) {
            return 1;
        }else{                    /*This is perfect syntax for returning values */
            return 0;
        }
    }

    public static int demo(int value){
        if (value == 2) {
            return 1;
        }                           /*This is perfect syntax for returning values */
        return value;
    }
    


    public static void test(){
        System.out.println("Hello");
        return;                         /*Inside void methods it totally fine that we can use*/
    }


    


    public static void main(String[] args) {
      int result =   test(2);
      System.out.println(result);
      test();
        
    }
    
}
