// public class pyramidpattern12 {
//     public static void main(String[] args){
//         int row = 5;
//         for(int i = 1; i<= row; i++){
//             for(int k = 1; k<= row-i; k++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
                  
//         }

//     }
// }        

//Print Diamond Pattern
public class pyramidpattern12 {
    public static void main(String[] args){
        int row = 5;
        for(int i = 1; i<= row; i++){
            for(int k = 1; k<= row-i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
                  
        }
        int n = 4;
         for(int i = n; i>= 1; i--){
            for(int k = 0; k<= n-i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
