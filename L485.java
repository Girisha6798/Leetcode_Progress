class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ct = 0; // ct bar bar reset hoga when val == 0;
        int maxct = 0; // max kaha to maxct var 
        
        for(int val : nums){
            if(val == 1){
                ct++;
                maxct = Math.max(maxct, ct);
            } else {
                ct = 0;
            }
        }
        return maxct;
    }
}