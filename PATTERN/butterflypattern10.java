public class butterflypattern10 {
    public static void main(String[] args){
        int row = 10;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j<= i; j++){
                System.out.print("*");  
            }
            int space = 2*(row - i);
            for(int k = 1; k <=space; k++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =row; i>=1; i--){
            for(int j = 1;j<=i; j++){
                System.out.print("*");
            }
            int space = 2*(row-i);
            for(int l =1; l<=space; l++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
