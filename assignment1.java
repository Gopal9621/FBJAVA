// 1 SUM OF N NATURAL NUMBER
import java.util.*;

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=N; i++){
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}

// 2 MULTIPLICATION TABLE
// import java.util.*;
// public class Table {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();

//         for(int i=1; i<=10; i++){
//             System.out.println(N + " x " + i + " = " + (N*i));
//         }
//     }
// }

// // 3 Factorial
// import java.util.*;

// public class Factorial {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int fact = 1;

//         for(int i=1; i<=N; i++){
//             fact *= i;
//         }

//         System.out.println("Factorial = " + fact);
//     }
// }

// 4 COUNT DIGITS
// import java.util.*;

// public class CountDigits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int count = 0;

//         while(num > 0){
//             num /= 10;
//             count++;
//         }

//         System.out.println("Digits = " + count);
//     }
// }

// 5 SUM OF DIGITS
// import java.util.*;

// public class SumDigits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0;

//         while(num > 0){
//             sum += num % 10;
//             num /= 10;
//         }

//         System.out.println("Sum of digits = " + sum);
//     }
// }

// 6 PALINDROME
// import java.util.*;

// public class Palindrome {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int original = num, rev = 0;

//         while(num > 0){
//             rev = rev*10 + (num % 10);
//             num /= 10;
//         }

//         if(original == rev) System.out.println("Palindrome");
//         else System.out.println("Not Palindrome");
//     }
// }
// 7 FIBONACCI
// import java.util.*;

// public class Fibonacci {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int a = 0, b = 1;

//         for(int i=1; i<=N; i++){
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next;
//         }
//     }
// }
// import java.util.*;

// 8 PRIME NUMBER

// public class Prime {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         boolean isPrime = true;

//         if(num < 2) isPrime = false;
//         else {
//             for(int i=2; i<=num/2; i++){
//                 if(num % i == 0){
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }

//         if(isPrime) System.out.println("Prime");
//         else System.out.println("Not Prime");
//     }
// }
// 9 ARMSTRONG NUMBER
// import java.util.*;

// public class Armstrong {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int original = num, sum = 0;

//         while(num > 0){
//             int d = num % 10;
//             sum += d*d*d;
//             num /= 10;
//         }

//         if(sum == original) System.out.println("Armstrong");
//         else System.out.println("Not Armstrong");
//     }
// }
// 10 STRONG NUMBER
// import java.util.*;

// public class Strong {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int original = num, sum = 0;

//         while(num > 0){
//             int d = num % 10;
//             int fact = 1;
//             for(int i=1; i<=d; i++) fact *= i;
//             sum += fact;
//             num /= 10;
//         }

//         if(sum == original) System.out.println("Strong");
//         else System.out.println("Not Strong");
//     }
// }

// 11 PYTHOGOREAN TRIPLET
// import java.util.*;

// public class Pythagorean {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int limit = sc.nextInt();

//         for(int a=1; a<=limit; a++){
//             for(int b=a; b<=limit; b++){
//                 for(int c=b; c<=limit; c++){
//                     if(a*a + b*b == c*c){
//                         System.out.println(a + ", " + b + ", " + c);
//                     }
//                 }
//             }
//         }
//     }
// }
    
// }
