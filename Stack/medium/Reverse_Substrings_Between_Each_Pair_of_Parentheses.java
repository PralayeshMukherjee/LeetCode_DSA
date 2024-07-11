//https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/description/?envType=daily-question&envId=2024-07-11

// 1190. Reverse Substrings Between Each Pair of Parentheses
import java.util.*;
class Solution {
    public void reverseStiring(StringBuilder sb, int st, int ed){
        while(st<ed){
            char temp = sb.charAt(st);
            sb.setCharAt(st,sb.charAt(ed));
            sb.setCharAt(ed,temp);
            st++;
            ed--;
        }
    }
    public String reverseParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stk.push(sb.length());
            }else if(ch==')'){
                int st = stk.pop();
                reverseStiring(sb,st,sb.length()-1);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}