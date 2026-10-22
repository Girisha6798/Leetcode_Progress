class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            } else {
                char top = st.peek();

                // if (ch != top) { // keep one copy
                //     st.push(ch);
                // }

                if(ch == top){ // remove all adjacent duplicates
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
        String ans = "";
        while(!st.isEmpty()){
            ans = st.pop() + ans; // 
        }

        return ans;
    }
}