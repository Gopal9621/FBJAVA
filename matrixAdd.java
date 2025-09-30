
public class matrixAdd {
      public static void main(String[] arga){
        int[][] A = {{1, 2, 3},{4, 5, 6},{2, 3, 4}};
        int[][] B = {{2, 3, 4},{5, 6, 7},{1, 2, 4}};
        int[][] C = new int[3][3];

        // System.out.print(A.length);
        for(int i = 0; i < A.length; i++){
          for(int j = 0; j< A[0].length; j++){
            C[i][j] = A[i][j] + B[i][j];

          }
        }
        // System.out.println("Matrix Addition");
        for(int [] row : C){
          for(int val : row){
      System.out.print(val + " ");
          }
          System.out.println();
        }
    }
}
