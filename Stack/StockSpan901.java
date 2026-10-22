import java.util.Stack;

class StockSpanner {

    Stack<int[]> st = new Stack<>(); // stack ke andr array store hogi

    // public StockSpanner() {
    // }

    public int next(int price) {
        int span = 1;

        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.peek()[1]; // st.peek() : 100, st.peek()[0] : 0(idx)
            st.pop();
        }

        st.push(new int[]{price, span});

        return span;
    }
}