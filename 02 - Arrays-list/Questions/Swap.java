

import java.util.*;
public class Swap {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1, 2, 45, 56};
        swap(arr, 1, 2);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}