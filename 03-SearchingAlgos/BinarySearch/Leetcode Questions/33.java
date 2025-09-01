class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivotSearch(nums);
        if(pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if(target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length -1 );
    }

    public int pivotSearch(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(mid < e && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > s && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[mid] <= arr[s]) {
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public int binarySearch(int[] arr, int key, int s, int e){
        
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