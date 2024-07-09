import java.util.ArrayList;
class MyQueue {
    public ArrayList<Integer> arr;
    public int front;
    public MyQueue() {
        arr = new ArrayList<>();
        front = 0;
    }
    
    public void push(int x) {
        arr.add(x);
    }
    
    public int pop() {
        int element = arr.get(front);
        front++;
        return element;
    }
    
    public int peek() {
        return arr.get(front);
    }
    
    public boolean empty() {
        return arr.size()==front;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */