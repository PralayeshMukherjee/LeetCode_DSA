//https://leetcode.com/problems/two-sum/submissions/1303848600/

// 1. Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // array of two integer for returning array
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
            // it is for first number
            for(int j=i+1;j<nums.length;j++){
                // it is for second number
                if(nums[i]+nums[j]==target){
                    // if both sum equal to target then push in the array and return array
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        // for ignoring the "missing return statement" 
        return ans;
    }
}