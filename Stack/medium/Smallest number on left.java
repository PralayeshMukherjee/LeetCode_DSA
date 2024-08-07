// https://www.geeksforgeeks.org/problems/smallest-number-on-left3403/1

// Smallest number on left
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        Stack<Integer> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<n){
            while(!st.isEmpty() && st.peek()>=a[i]){
                st.pop();
            }
            if(st.isEmpty()){
                list.add(-1);
            }else{
                list.add(st.peek());
            }
            st.push(a[i]);
            i++;
        }
        return list;
    }
}
// time complexity is :- O(2n)
// space complexity is :- O(n) + O(n)