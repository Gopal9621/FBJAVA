public class palindrome{
    public static void main(String[] args){
        int num = 122;
        int original = num;
        int reverse = 0;
        
    while (num != 0){
        int digit = num%10;
        reverse = reverse*10 + digit;
        num  /=  10;
    }
    System.out.println("Reverse number is " + reverse);

    if(original == reverse){
        System.out.println("It is a palindrome");}
        else{
            System.out.println("It is not a palindrome");
        
    }
}  
    }




