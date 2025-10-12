 import java.util.Scanner;
 public class reportcard {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of student :");
    String name = sc.nextLine();

    System.out.println("Enter the student ID number :"); 
    String id = sc.nextLine(); // consume leftover newline

    System.out.println("Enter the phone number of student");
    // No need to create a new Scanner, use the existing one
    String phone = sc.nextLine();

    System.out.println("Enter the email id of student");
    String email = sc.nextLine();

      int[] marks = new int[5];
      int total = 0;
   for (int i = 0; i < 5; i++) {
      System.out.println("Enter marks for subject " + (i + 1) + ":");
    
      marks[i] = sc.nextInt();
      sc.nextLine(); // consume leftover newline
      total += marks[i];
     }
     System.out.println("Total marks: " + total);
     System.out.println("Average marks: " + (total / 5.0));
   
   }
}


