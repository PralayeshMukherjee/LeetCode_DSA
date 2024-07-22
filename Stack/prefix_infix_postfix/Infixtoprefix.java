package Stack.prefix_infix_postfix;

import java.util.Stack;

public class Infixtoprefix{
    public static String f(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String ans = "";
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='('){
                sb.setCharAt(i,')');
                continue;
            }
            if(sb.charAt(i)==')'){
                sb.setCharAt(i,'(');
            }
        }
        Stack<Character> stk = new Stack<>();
        int i =0;
        while(i<sb.length()){
            char ch = sb.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
                stk.push(ch);
            }else if(ch=='('){
                stk.push(ch);
            }else if(ch==')'){
                while(!stk.isEmpty() && stk.peek()=='('){
                    ans+=stk.pop();
                }
                stk.pop();
            }else{
                if(ch=='^'){
                    while (!stk.isEmpty()) {
                        ans += stk.pop();
                    }
                }
                stk.push(ch);
            }
            i++;
        }
        while(!stk.isEmpty()){
            ans += stk.pop();
        }
        StringBuilder res = new StringBuilder(ans);
        res.reverse();
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "(A+B)*C-D+F";
        System.out.println(f(s));
    }
}
// time complexity is :- O(n) * O(n)