class Solution {
    public int firsto(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public int lasto(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/ 2;
            if(nums[mid] == target){
                ans = mid;
                low = mid + 1;
            } else if(nums[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = firsto(nums, target);
        int last = lasto(nums, target);
        return new int[]{first, last};
    }
}