// https://leetcode.com/problems/online-stock-span/description/

// 901. Online Stock Span
class Pair{
    int x;
    int span;
    Pair(int x,int span){
        this.x = x;
        this.span = span;
    }
}
class StockSpanner {
    public Stack<Pair> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!st.isEmpty() && st.peek().x<=price){
            Pair p = st.pop();
            span = span+p.span;
        }
        st.push(new Pair(price,span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */