// https://leetcode.com/problems/three-consecutive-odds/description/?envType=daily-question&envId=2024-07-01

// 1550. Three Consecutive Odds

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        // iterate through array
        for(int i=0;i<arr.length;i++){
            // if array element is odd then increment count increases by 1
            if(arr[i]%2 !=0){
                count++;
                // if we found three consecutive odd number then return true
                if(count==3) return true;
            }else{
                // if even then break our condition and count become zero
                count = 0;
            }
        }
        return false;
    }
}