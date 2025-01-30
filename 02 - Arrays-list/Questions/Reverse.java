
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 55, 23};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
