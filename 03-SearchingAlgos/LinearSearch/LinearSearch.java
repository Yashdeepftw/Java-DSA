
import java.util.*;


public class LinearSearch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1, 23, 34, 432, 34, 34, 34342, 33};
        int key = 34;
            System.out.println("Target found at the index number: " + linearSearch(arr, key));    
            System.out.println("Target found: " + linearSearch2(arr, key));    
    }

    // search in the array: return the index if item found
    // ohterwise if item not found return -1
    static int linearSearch(int[] arr, int key){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1; 
    }

    static int linearSearch2(int[] arr,int key){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return arr[i];
            }
        }
        return -1;
    }
}
