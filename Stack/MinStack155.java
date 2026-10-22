class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> mins = new Stack<>();
    public MinStack() {
        // constructor
    }
    
    // all func are in O(1) Time complexity
    public void push(int value) {
        st.push(value); // stack me value push
        // minstack me pehle empty condition check
        if(mins.size() == 0 || value <= mins.peek()){
            mins.push(value);
        } else { // jo pehle se min he wohi push
            mins.push(mins.peek());
        }
    }
    
    public void pop() {
        st.pop();
        mins.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}