public class rhombuspattern11 {
    public static void main(String[] args){
        int row = 5;
        for(int i = 1; i <= row; i++){
            for(int k = 1; k<=row-i; k++){
                System.out.print(" ");
            }
            
            for(int j = 1; j<=row; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
