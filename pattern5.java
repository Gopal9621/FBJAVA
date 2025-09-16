import java.util.*;


public class pattern5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int k = 1; k <= row - i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
