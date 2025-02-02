public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-1, 1, 2, 3, 5, 23, 44, 55};
        int key = 3;
        int ans = orderAgnosticBS(arr, key);
        System.out.println(ans);
    }
    
    static int orderAgnosticBS(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        boolean isAsc = arr[s] < arr[e];
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(arr[mid] == key){
                return mid;
            }
            if (isAsc) {
                if(key < arr[mid]){
                    e = mid - 1;
                }
                else if (key > arr[mid]){
                    s = mid + 1;
                }
            }
            else {
                if(key > arr[mid]){
                    e = mid - 1;
                }
                else if(key < arr[mid]){
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
