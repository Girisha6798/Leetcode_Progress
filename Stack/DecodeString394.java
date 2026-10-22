class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<StringBuilder> st = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                num.push(k);
                st.push(curr);
                curr = new StringBuilder();
                k = 0;
            } 
            else if (ch == ']') {
                int count = num.pop();
                StringBuilder prev = st.pop();

                for (int i = 0; i < count; i++) {
                    prev.append(curr);
                }

                curr = prev;
            } 
            else {
                curr.append(ch);
            }
        }

        return curr.toString();
    }
}