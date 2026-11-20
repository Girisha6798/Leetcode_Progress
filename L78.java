class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> current = new ArrayList<>();

        generate(0, nums, current, ans);

        return ans;
    }
    public void generate(int index, int[] nums,
                         List<Integer> current,
                         List<List<Integer>> ans) {

        // Base case
        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // 1. Include current element
        current.add(nums[index]);

        generate(index + 1, nums, current, ans);
       // back tracking
        current.remove(current.size() - 1);

        // 2. Exclude current element
        generate(index + 1, nums, current, ans);
    }
}