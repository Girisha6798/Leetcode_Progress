class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // MONOTONIC STACK
        Stack<Integer> st = new Stack<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nge = new int[n2];

        for(int i = n2 - 1; i >= 0; i--){
            while(st.size() > 0 && st.peek() <= nums2[i]){
                st.pop();
            }

            if(st.size() == 0){
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(nums2[i]); 

            // yeh ab nums2 {1,3,4,2} ke acc stack bangia and nge = {3,4,-1,-1} 
            // we want n1 ke accoridng to ek aur array 
        }

        int[] ans = new int[n1];

            for(int i = 0; i < n1; i++){
                for(int j = 0; j < n2; j++){
                    if(nums1[i] == nums2[j]){
                        ans[i] = nge[j];
                        break;
                    }
                }
            }
        return ans;
    }
}