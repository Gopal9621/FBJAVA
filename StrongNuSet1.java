import java.util.Scanner;

public class StrongNuSet1{
    // Method to calculate factorial of a digit
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check Strong number
    static boolean isStrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();   // Input number

        if (isStrong(num)) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}
