import java.util.*;
public class CircumCircle {
    public static double getCircumference(double r){
         return 2* 3.14 *r;
    }
public static void main(String[] ags){
    Scanner sc= new Scanner(System.in);
    double r = sc.nextInt();
    System.out.println(" Circumference of circle is : "+getCircumference(r));
}    
}
