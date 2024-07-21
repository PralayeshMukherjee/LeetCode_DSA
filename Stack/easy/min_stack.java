// https://leetcode.com/problems/min-stack/description/

// 155. Min Stack

class MinStack {
    Stack<Integer> stk;
    Stack<Integer> min;
    public MinStack() {
        stk = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(min.isEmpty()){
            min.push(val);
        }else{
            min.push(Math.min(val,min.peek()));
        }
    }
    
    public void pop() {
        stk.pop();
        min.pop();
    }
    
    public int top() {
        // if(stk.isEmpty()) return 0;
        return stk.peek();
     }
    
    public int getMin() {
        // if(stk.isEmpty()) return 0;
        return min.peek();
    }
}