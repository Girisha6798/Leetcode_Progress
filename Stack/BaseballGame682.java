class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            String ch = arr[i];

            if (ch.equals("C")){
                st.pop();

            } else if(ch.equals("D")){
                st.push(2*st.peek());

            } else if(ch.equals("+")){ // take last 2 ele and sum
                int top = st.pop();
                int top2 = st.peek();
                int sum = top + top2;
                st.push(top);
                st.push(sum);
            } else {
                st.push(Integer.parseInt(ch)); 
                // convert str to int
            }
        }

        int ans = 0;
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}