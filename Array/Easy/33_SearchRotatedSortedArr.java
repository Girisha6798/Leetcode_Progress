class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
      
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){ // target milgya to return mid
                return mid;
            } 
            // LEFT SORTED 
            else if(nums[low] <= nums[mid]){ 
                if(target < nums[mid] && target >= nums[low]){ // main condition, target < low and > mid
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } 
            // RIGHT SORTED
            else {
                if(target > nums[mid] && target <= nums[high]){  // main condition, target > mid and < high
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}