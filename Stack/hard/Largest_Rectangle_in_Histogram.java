// https://leetcode.com/problems/largest-rectangle-in-histogram/description/

// 84. Largest Rectangle in Histogram
import java.util.*;
//                                 Approach 1
class Solution {
    public void nse(int[]heights,List<Integer> arr){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        // List<Integer> arr = new ArrayList<>();
        // int i=;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr.add(n);
            }else{
                arr.add(st.peek());
            }
            st.push(heights[i]);
        }
    }
    public void pse(int[] heights,List<Integer> arr){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        // List<Integer> arr = new ArrayList<>();
        // int i=0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr.add(-1);
            }else{
                arr.add(st.peek());
            }
            st.push(heights[i]);
        }
    }
    public int largestRectangleArea(int[] heights) {
        List<Integer> PSE = new ArrayList<>();
        List<Integer> NSE = new ArrayList<>();
        pse(heights,PSE);
        nse(heights,NSE);
        int max = 0;
        for(int i=0;i<heights.length;i++){
            max = Math.max(max,heights[i]*(NSE.get(i)-PSE.get(i)-1));
        }
        return max;
    }
}

//                                          Approach 2 (best solution)
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int maxArea = 0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int element = st.pop();
                int nse = i;
                int pse = !st.isEmpty() ? st.peek() : -1;
                maxArea = Math.max(maxArea,heights[element]*(nse-pse-1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int element = st.pop();
            int nse = n;
            int pse = !st.isEmpty() ? st.peek() : -1;
            maxArea = Math.max(maxArea,heights[element]*(nse-pse-1));
        }
        return maxArea;
    }
}
// time complexity is:- O(n)+O(n) = O(2n)
// space complexity is:- O(n)