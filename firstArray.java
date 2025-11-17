
// public class firstArray {
//     public static void main(String[] args){
//         int[] marks = new int[5];
//      marks[0] = 50;
//      marks[1] = 70;
//      marks[2] = 90;
//      marks[3] = 79;
//      marks[4] = 98;

//      for(int i = 0; i< 5; i++){
//         System.out.print(marks[i] + " ");
//      }
//    System.out.print(" ");
//     }

// }

// take array input from user and print

import java.util.*;
public class firstArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int[size];
        for(int i = 0; i<size; i++){
            number[i] = sc.nextInt();
        }
        for(int i = 0; i<size; i++){
            System.out.print(number[i]+" ");
        }
    }
}
