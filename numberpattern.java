public class numberpattern {

    public static void main(String[] args){
        int n = 5;
        for(int i = 0; i < n/2; i++){
           System.out.print("*");  
           for(int m = 0; m < n+2;m++){
            System.out.print(" ");
           } 
           for(int j = 1; j <= i+1;j++){
              System.out.print("*");
           }  
           System.out.println();      
        }
        for(int i = 0; i< n+3; i++){
            System.out.print("*");
        }
        for(int i = 0; i< n/2 +1 ; i++){
            System.out.print("*");
        }
       System.out.println(); 
    }
}