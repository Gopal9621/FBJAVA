// public class swap {
//     public static void main(String[] args) {
//      int a = 5;
//      int b = 10;
//    System.out.println("before swap: a = " +a + " b = " +b);
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("after swap: a = " + a + " b =  " +b);
//     }
// }
public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        // Swapping using arithmetic operations
        a = a + b; // a now becomes 15
        b = a - b; // b becomes 5 (15 - 10)
        a = a - b; // a becomes 10 (15 - 5)
        
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}      

