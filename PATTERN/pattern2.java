// print pattern like hollow rectengle

import java.util.*;
public class pattern2 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    for(int i = 1; i<= row ; i++){
      for(int j = 1; j <= col; j++){
        if(i ==1 || j == 1 || i == row || j == col){
            System.out.print(" *");
        }
        else{
            System.out.print("  ");
        }
      } 
      System.out.println(); 
    } 
}
    
}
