import java.util.*;
public class SearchInRange {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1, 2, 23, 233, 453, 2333};
        int key = 23;
        System.out.println(searchInRange(arr, key));
    }

    static int searchInRange(int[] arr, int key){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
