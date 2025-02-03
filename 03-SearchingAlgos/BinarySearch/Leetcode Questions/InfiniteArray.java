// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 150, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int key) {
        // first find the range
        // first start with a box of size 2
        int s = 0;
        int e = 1;
        
        // condition for the key to lie in the range
        while (key > arr[e]) {
            int newStart = e + 1;
            // double the box value
            // end = previous end + size of box * 2
            e = e + (e - s + 1) * 2;
            s = newStart;
        }
        return binarySearch(arr, key, s, e);
    }

    static int binarySearch(int[] arr, int key, int s, int e){
        
        while(s <= e){
            // find the middle element
            // int mid = ( start + end ) / 2;// as int has limited value range so this will do the mid element only to the limited range
            int mid = s + (e - s) / 2;
            if(key < arr[mid]){
                e = mid - 1;
            }
            else if(key > arr[mid]){
                s = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
