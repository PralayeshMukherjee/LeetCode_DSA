// https://leetcode.com/problems/remove-k-digits/description/

// 402. Remove K Digits

class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k) return "0";
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k!=0 && st.peek()-'0'>num.charAt(i)-'0'){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        int i=0;
        while(sb.length()!=0 && sb.charAt(i)=='0'){
            sb.deleteCharAt(i);
            // i++;
        }
        if(sb.length()==0) return "0";
        return sb.toString();
    }
}