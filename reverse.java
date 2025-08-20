// Method 1:
// take a number and reverse it by taking value from user input

// import java.util.Scanner;
// public class reverse {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int reversed = 0;

//         while(num != 0) {
//             int digit = num % 10;
//             reversed = reversed * 10 + digit;
//             num /= 10;
//         }

//         System.out.println("Reversed number: " + reversed);

//     }
    
// }


// Method 2:
// take a number and reverse it
public class reverse {
    public static void main(String[] args) {
        int num = 12345; // Example number
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number: " + reversed);
    }
}


