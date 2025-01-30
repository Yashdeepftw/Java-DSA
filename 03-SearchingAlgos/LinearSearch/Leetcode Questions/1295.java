https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums ){
            if(evenDigits(num)){
                count++;
            }
        }
        return count;
    }
    boolean evenDigits(int num){
        int numOfDigits = digits(num);
        if(numOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
    int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num) + 1);
    }
    // int digits(int num){
    //     if(num < 0){
    //         num = num * -1;
    //     }
    //     if(num == 0){
    //         return 1;
    //     }
    //     int count = 0;
    //     while (num > 0){
    //         count ++;
    //         num = num / 10;
    //     }
    //     return count;
    // }
}