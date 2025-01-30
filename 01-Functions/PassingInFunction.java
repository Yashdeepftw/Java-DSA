

import java.util.*;
public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums = {3,44,55,6,21};
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;//mutable behaviour as arrays are mutable in java and strings are not mutable in java
    }
}
