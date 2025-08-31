import java.util.Scanner;
public class operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first num: ");
        int a = sc.nextInt();

        System.out.print("Enter a second num: ");
        int b = sc.nextInt();

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        
        System.out.println("sum= "+ sum);
        System.out.println("sub= "+ sub);
        System.out.println("mul= "+ mul);
        System.out.println("div= "+ div);
        System.out.println("mod= "+ mod);
        sc.close();
    }
}