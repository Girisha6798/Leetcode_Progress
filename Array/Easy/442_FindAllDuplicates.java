package Array.Easy;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // same as 448 -> negative marketing technique
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0){
                nums[index] = -nums[index];
            } else {
                ans.add(Math.abs(nums[i]));
            }
        }
        return ans;
    }
}