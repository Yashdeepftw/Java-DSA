

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 23, 233, 453, -10, 2333};
        System.out.println(minNumber(arr));
    }
    
    static int minNumber(int[] arr){
        int min = Integer.MIN_VALUE;
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(min < arr[i]){
                min = arr[i];
                return min;
            }
        }
        return -1;
    }
}
