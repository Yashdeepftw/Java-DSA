

import java.util.*;

public class MultiDimension {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
            1, 2, 3 // 0th index
            4, 5, 6// 1st index
            7, 8, 9// 2nd index
        */
        // 2D arrays are arrays of arrays means an array contains other numbers of arrays on itself

        int[][] arr = new int[3][3];// adding rows number is mandatory
        int[][] arr2 = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9, 10, 11}
        };
        System.out.println(Arrays.toString(arr2[1]));

        // input
        // for each row
        for(int i = 0; i < arr.length; i++){
            // for each column 
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0;j<arr[i].length; j++){
                // System.out.print(arr[i][j] + " ");
                System.out.println(Arrays.toString(arr[i]));
            }
            System.out.println();

        }
        // to string method
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        // using for each loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
