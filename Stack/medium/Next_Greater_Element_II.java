// https://leetcode.com/problems/next-greater-element-ii/description/

// 503. Next Greater Element II
import java.util.Stack;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        Stack<Integer> st = new Stack<>();
        int i = 2*n-1;
        while(i>=0){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()){
                    arr[i] = -1;
                }else{
                    arr[i] = st.peek();
                }
            }
            st.push(nums[i%n]);
            i--;
        }
        return arr;
    }
}