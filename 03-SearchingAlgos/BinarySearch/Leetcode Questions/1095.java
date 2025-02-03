// https://leetcode.com/problems/find-in-mountain-array/

class Solution {

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak + 1, arr.length -1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int s =0;
        int e = arr.length - 1;
        while(s < e) {
            int mid = s + (e - s) / 2;
            if(arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            }
            else {
                e = mid;
            }
        }
        return s;
    }

    static int orderAgnosticBS(int[] arr, int key, int s, int e){
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