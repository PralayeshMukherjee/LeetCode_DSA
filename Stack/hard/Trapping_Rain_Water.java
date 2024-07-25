// https://leetcode.com/problems/trapping-rain-water/description/

// 42. Trapping Rain Water
class Solution {
    public void sMax(int n,int suffix_Max[],int[] height){
        suffix_Max[n-1] =  height[n-1];
        for(int i=n-2;i>=0;i--){
            suffix_Max[i] = Math.max(suffix_Max[i+1],height[i]);
        }
    }
    public void pMax(int n,int prefix_Max[],int[] height){
        prefix_Max[0] = height[0];
        for(int i=1;i<n;i++){
            prefix_Max[i] = Math.max(prefix_Max[i-1],height[i]);
        }
    }
    public int trap(int[] height) {
        int n = height.length;
        int prefix_Max[] = new int[n];
        int suffix_Max[] = new int[n];
        pMax(n,prefix_Max,height);
        sMax(n,suffix_Max,height);
        int total = 0;
        for(int i=0;i<n;i++){
            int leftMax = prefix_Max[i], rightMax = suffix_Max[i];
            if(height[i]<leftMax && height[i]<rightMax){
                total += Math.min(leftMax,rightMax) - height[i];
            }
        }
        return total;
    }
}
// time complexity is :- O(2n) + O(n) = O(3n)