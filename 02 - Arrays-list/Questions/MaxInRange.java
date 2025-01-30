

public class MaxInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 88, 324, 2};
        System.out.println(MaxInRange(arr, 1, 6));
    }

    static int MaxInRange(int[] arr, int a, int b){
        int max = 0;
        for(int i = a; i<= b; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
