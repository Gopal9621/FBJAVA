import java.util.*;
public class bubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0; i<n-1;i++){
            for(int j=0;j<n-i-1; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i= 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


// import java.util.*;
// public  nclass bubbleSort {
//    public static void printArray(int arr[]) {
//        for(int i=0; i<arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void main(String args[]) {
//        int arr[] = {7, 8, 1, 3, 2};
       //bubble sort
    //    for(int i=0; i<arr.length-1; i++) {
    //        for(int j=0; j<arr.length-i-1; j++) {
    //            if(arr[j] > arr[j+1]) {
                   //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        printArray(arr);
//    }
//    }
