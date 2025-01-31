
import java.util.*;
public class BinarySearch {
    static Scanner sc = new Scanner(System.in);
    // this algo is used to do searching in already sorted arrays
    // find the middle element of the array then compare it with key element if greater and search in right side of the array if not then in the left part 
    // if middle element is the key then its the answer
    public static void main(String[] args) {
        int[] arr = {-1, 1, 2, 3, 5, 23, 44, 55};
        int key = 3;
        int ans = binarySearch(arr, key);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length;
        while(start <= end){
            // find the middle element
            // int mid = ( start + end ) / 2;// as int has limited value range so this will do the mid element only to the limited range
            int mid = start + (end - start) / 2;
            if(key < arr[mid]){
                end = mid - 1;
            }
            else if(key > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
