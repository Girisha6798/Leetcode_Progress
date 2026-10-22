class Solution {
    public int[] canSeePersonsCount(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(a[n-1]);
        a[n-1] = 0;

        for(int i = n -2; i>=0;i--){
            int count = 0;
            while(st.size() > 0 && st.peek()<= a[i]){
                count++;
                st.pop();
            }
            if(st.size() > 0) count++;
            ans[i] = count;
            st.push(a[i]);
        }
        return ans;
    }
}