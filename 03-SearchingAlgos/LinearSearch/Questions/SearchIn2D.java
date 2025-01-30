
import java.util.*;
public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9, 10, 11}
        };
        int key = 2;
        int[] ans = searchIn2D(arr, key);
        System.out.println(Arrays.toString(ans));
        System.out.println(maxIn2D(arr));
    }
    static int[] searchIn2D(int[][] arr, int key){
        if(arr.length == 0){
            return new int[] {-1, -1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(key == arr[i][j]){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    } 

    static int maxIn2D(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}