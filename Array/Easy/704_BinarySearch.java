class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2; // helps overcome overflow as if we do (high + low)/ 2 int overflows
            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid]  < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}