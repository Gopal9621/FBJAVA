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
    public class swap{
        public static void main(String[] args){
            int a = 5; 
             int b = 10;

         a = a + b;
         b = a - b;
         a = a - b;
         System.out.println("before swapping; a = " + a + " b = " + b);
         System.out.println("after swapping; a = " + a + " b = " + b);

        }

}        

