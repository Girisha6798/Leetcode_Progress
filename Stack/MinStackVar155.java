import java.util.Stack;
class MinStack {

    Stack<Long> st = new Stack<>();
    long min;

    public MinStack() {
        // constructor
        min = Long.MAX_VALUE;
    }

    // all func are in O(1) Time complexity
    public void push(int value) {
        long val = value;

        if (st.size() == 0) min = val;

        if (val >= min) {
            st.push(val);
        } else { // fake value
            st.push(val + (val - min));
            min = val;
        }
    }

    public void pop() {
        if (st.peek() < min) { // locha h , roll back
            min = min + (min - st.peek());
        }
        st.pop();
    }

    public int top() {
        if (st.peek() < min) { // locha h , roll back
            return (int) min;
        }
        return st.peek().intValue();
    }

    public int getMin() {
        return (int) min;
    }
}

