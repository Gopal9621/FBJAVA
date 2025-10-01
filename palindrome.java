// public class palindrome{
//     public static void main(String[] args){
//         int num = 122;
//         int original = num;
//         int reverse = 0;
        
//     while (num != 0){
//         int digit = num%10;
//         reverse = reverse*10 + digit;
//         num  /=  10;
//     }
//     System.out.println("Reverse number is " + reverse);

//     if(original == reverse){
//         System.out.println("It is a palindrome");}
//         else{
//             System.out.println("It is not a palindrome");
        
//     }
// }  
//     }



// public class palindrome {
//     public static void main(String[] args) {
//         int num = 121; // Example number
//         int reverse = 0;

//         while (num != 0) {
//             int digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num /= 10;
//         }

//         System.out.println("Reversed number: " + reverse);

//     }    
//     } 


import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = sc.nextLine();

        System.out.println("Enter a id: ");
        int id = sc.nextInt();

        System.out.println("Enter a rollno: ");
        int rollno = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter a email: ");
        String email = sc.nextLine();

        int[] marks = new int[5];
        int total = 0;
        for (int i = 0; i <5; i++) {
            System.out.print("Enter marks of Subject "+(i+1)+": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double average = total/5.0;
    
        for (int i = 0; i < 5; i++) {
            if (marks[i] < 35) {
                System.out.println("Subject " +(i + 1) + ":FAIL");
            } else {
                System.out.println("Subject " +(i + 1) + ":PASS");
            }
        }
        
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Email: " + email);
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        char grade;
        switch ((int) average / 10) {
           
            case 10,9: grade = 'A'; break;
            case 8,7: grade = 'B'; break;
            case 6,5: grade = 'C'; break;
            default: grade = 'D'; break;
            
        }
        System.out.println("Grade: " + grade);

        sc.close();

    }
    
}
