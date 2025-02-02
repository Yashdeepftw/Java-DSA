// floor is the greatest number smaller or equal to the key

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,67,88};
        int key = 80;
        int ans = floorOfNumber(arr, key);
        System.out.println(ans);
    }
    
    static int floorOfNumber(int[] arr, int key) {
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
        return e;
    }
}
