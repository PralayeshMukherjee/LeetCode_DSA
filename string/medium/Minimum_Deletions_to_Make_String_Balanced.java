// https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/description/

// 1653. Minimum Deletions to Make String Balanced
package string.medium;
class Solution {
    public int minimumDeletions(String s) {
        int count = 0, answer = 0;
        for(char ch:s.toCharArray()){
            if(ch=='b'){
                count++;
            }else if(count != 0){
                answer++;
                count--;
            }
        }
        return answer;
    }
}
