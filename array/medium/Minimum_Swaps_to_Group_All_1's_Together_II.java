// https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii/description/

// 2134. Minimum Swaps to Group All 1's Together II
package array.medium;
import java.util.Arrays;
class Solution {
    public int minSwaps(int[] nums) {
        int k = Arrays.stream(nums).sum();
        int n = nums.length;
        int cnt = 0;
        for (int i = 0; i < k; ++i) {
            cnt += nums[i];
        }
        int mx = cnt;
        for (int i = k; i < n + k; ++i) {
            cnt += nums[i % n] - nums[(i - k + n) % n];
            mx = Math.max(mx, cnt);
        }
        return k - mx;
    }
}
// time complexity is :- O(n)
// space complexity is :- O(1)