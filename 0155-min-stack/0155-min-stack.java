class MinStack {
        int min=Integer.MAX_VALUE;
        Stack<Integer> minst;
        Stack<Integer> minval;
        
    public MinStack() {
         minst=new Stack<>();
         minval=new Stack<>();

    }
    
    public void push(int value) {
        
        minst.push(value);
        if(minval.isEmpty()|| value<=minval.peek())
            minval.push(value);
        
        
    }
    
    public void pop() {
        if(minst.peek().equals(minval.peek()))
            minval.pop();
        minst.pop();
        
    }
    
    public int top() {
            return minst.peek();
    }
    
    public int getMin() {
        return minval.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */