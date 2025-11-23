import java.util.*;
public class sumOfNOddN {
    public static void printSum(int n){
        int sum = 0;
        for(int i = 0; i<=n; i++){
            if(i%2 != 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }    
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      printSum(n);

    }    
}
