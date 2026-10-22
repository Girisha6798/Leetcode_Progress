class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 2*n - 1; i >= 0; i--){ // for circular array
            while(st.size() > 0 && st.peek() <= nums[i % n]){
                int a = st.pop();
            }
            if(i < n){
                if(st.size() == 0){
                   ans[i] = -1;
                } else {
                ans[i] = st.peek();
                }
            }
            st.push(nums[i % n]);
        }
        return ans;
    }
}