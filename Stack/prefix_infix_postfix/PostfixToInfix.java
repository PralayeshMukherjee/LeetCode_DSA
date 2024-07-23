package Stack.prefix_infix_postfix;

import java.util.Stack;

public class PostfixToInfix {
    public static String postToInfix(String exp) {
        // code here
        Stack<String> stk = new Stack<>();
        int i = 0;
        while(i<exp.length()){
            char ch = exp.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                stk.push(String.valueOf(ch));
            }else{
                String t1 = stk.pop();
                String t2 = stk.pop();
                String con = "("+t2+ch+t1+")";
                stk.push(con);
            }
            i++;
        }
        return stk.peek();
    }
    public static void main(String[] args) {
        String exp = "AB-DE+F*/";
        System.out.println(postToInfix(exp));
    }
}
