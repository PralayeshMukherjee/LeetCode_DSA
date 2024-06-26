// https://leetcode.com/problems/count-number-of-nice-subarrays/description/?envType=daily-question&envId=2024-06-22
// 1248. Count Number of Nice Subarrays
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int odd = 0;
        int count = 0;
        int finalCount = 0;
        int i,j=0;
        // here I apply sliding window concept
        for(i=0;i<nums.length;i++){
            // if nums[i] is odd then inc odd by 1 and count set to zero because for subarray
            if(nums[i]%2!=0){
                odd++;
                count=0;
            }
            // if odd count is equal to k then inc count and active the left pointer
            while(odd==k){
                count++;
                // if left pointer is point a odd element then dec the odd numbers
                if(nums[j]%2!=0){
                    odd--;
                }
                j++;
            }
            // push the all value of count in our final count
            finalCount+=count;
        }
        return finalCount;
        // time complexity big O(n) space O(n)
    }
}