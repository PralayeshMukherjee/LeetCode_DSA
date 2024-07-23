package Stack.prefix_infix_postfix;

import java.util.Stack;

public class PrefixToInfix {
    public static String preToInfix(String pre_exp) {
        // code here
        Stack<String> st = new Stack<>();
        int i = pre_exp.length()-1;
        while(i>=0){
            char ch = pre_exp.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                st.push(String.valueOf(ch));
            }else{
                String t1 = st.pop();
                String t2 = st.pop();
                String con = "("+t1+ch+t2+")";
                st.push(con);
            }
            i--;
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String pre_exp = "*-A/BC-/AKL";
        System.out.println(preToInfix(pre_exp));
    }
}
