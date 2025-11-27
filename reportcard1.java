import java.util.Scanner;
public class reportcard1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = sc.nextLine();

        System.out.println("Enter a id: ");
        String id = sc.nextLine();

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

