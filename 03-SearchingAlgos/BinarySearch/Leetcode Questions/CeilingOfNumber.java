// find number which is smallest number greater than or equal to the key number
//Ceiling of the number in the array

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,67,88};
        int key = 15;
        int ans = ceilingOfNumber(arr, key);
        System.out.println(ans);
    }
    
    static int ceilingOfNumber(int[] arr, int key) {
        if(key > arr[arr.length - 1]) {
            return -1;
        }
        int s = 0;
        int e = arr.length - 1;
        while(s <= e) {
            int mid = s + ( e - s ) / 2;
            if (key > arr[mid]) {
                s = mid + 1;
            }
            else if(key < arr[mid]) {
                e = mid - 1;
            }
            else {
                return mid;
            }
        }
        return s;
    }
}
