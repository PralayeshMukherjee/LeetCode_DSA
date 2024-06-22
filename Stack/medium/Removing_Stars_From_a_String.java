//https://leetcode.com/problems/removing-stars-from-a-string/description/?envType=study-plan-v2&envId=leetcode-75

// 2390. Removing Stars From a String
import java.util.*;

class Solution {
    public String removeStars(String s) {
        // create a stack
        Stack<Character> stk = new Stack<>();
        // push all character from s string and if the character is '*' then remove/pop the last elemtent that I push
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!='*'){
                stk.push(ch);
            }else{
                stk.pop();
            }
        }
        // here all '*' and the character of left of the '*' remove so store all element in the ans string until the stack is empty
        String ans = "";
        while(!stk.isEmpty()){
            ans += stk.peek();
            stk.pop();
        }
        // use String Builder methode to reverse the string for my final answer
        StringBuilder str= new StringBuilder(ans);
        str.reverse();
        return str.toString();
    }
}