//https://leetcode.com/problems/maximum-subarray/description/

//53. Maximum Subarray

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int finalSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            finalSum = Math.max(finalSum,sum);
            if(sum<0){
                sum = 0;
            }
        }
        return finalSum;
    }
}