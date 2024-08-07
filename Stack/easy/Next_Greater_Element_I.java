// https://leetcode.com/problems/next-greater-element-i/description/

// 496. Next Greater Element I
import java.util.HashMap;
import java.util.Stack;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int arr[] = new int[nums2.length];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums2.length;
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }else if(!st.isEmpty() && nums2[i]<st.peek()){
                map.put(nums2[i],st.peek());
            }else{
                while(!st.isEmpty() && nums2[i]>=st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    map.put(nums2[i],-1);
                }else{
                    map.put(nums2[i],st.peek());
                }
            }
            st.push(nums2[i]);
        }
        int ans[] = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}