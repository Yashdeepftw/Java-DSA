// https://leetcode.com/problems/find-peak-element/submissions/1529644679/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
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
}