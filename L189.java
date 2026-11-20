class Solution {
    public void reverse(int[] nums, int low, int high){
        // low = 0;
        // high = nums.length - 1; // dont use these here cuz main
        // me jab hum call krte he reverse to khud pass krte he low and high hr bar
        while(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n == 0) return;
        k = k % n;
        // if(k == 0) return;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k , n -1);

    }
}