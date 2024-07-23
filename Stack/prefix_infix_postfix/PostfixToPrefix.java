package Stack.prefix_infix_postfix;

import java.util.Stack;

public class PostfixToPrefix {
    public static String postToPre(String post_exp) {
        // code here
        Stack<String> st = new Stack<>();
        int i = 0;
        while(i<post_exp.length()){
            char ch = post_exp.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                st.push(String.valueOf(ch));
            }else{
                String t1 = st.pop();
                String t2 = st.pop();
                String con = ch+t2+t1;
                st.push(con);
            }
            i++;
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String post_exp = "ABC/-AK/L-*";
        System.out.println(postToPre(post_exp));
    }
}
// time complexity is :- O(n) - best case 
//                       O(n)+O(N1+N2) worst case