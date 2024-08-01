// https://leetcode.com/problems/number-of-senior-citizens/description/

// 2678. Number of Senior Citizens

class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0;i<details.length;i++){
            String s = details[i].substring(11,13);
            int age = Integer.parseInt(s);
            if(age>60){
                count++;
            }
        }
        return count;
    }
}

// time complexity is :- O(n)
// space complexity is :- O(1)