class Solution {
    int jump(int[] nums) {
        int jumps = 0, l = 0, r = 0;
        // l and r are start and end of range 
        // jump ++ whenevr range updates
        
        // while(l < r) // glt hoga kioki l, r range ke strt and end hee nakee pointer
        while(r < nums.length - 1){ 
            int farthest = 0;
            for(int i = l; i <= r; i++){ // range  
                farthest = Math.max(i + nums[i], farthest); // max idx we can reach
            }
            l = r + 1;
            r = farthest;
            jumps++;
        }
        return jumps;
    }
}