// print pattern of solid rectangle

import java.util.*;
public class pattern1 {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();

    for(int i = 1; i<= row; i++){
        for(int j = 1; j<=col; j++){
            System.out.print(" * ");
        }
        System.out.println();
    }
   } 
}
