package Stack.prefix_infix_postfix;
import java.util.Stack;
class infix_postfix {
    // Function to convert an infix expression to a postfix expression.
    public static int priority(char ch){
        if(ch=='^'){
            return 3;
        }else if(ch=='/' || ch=='*'){
            return 2;
        }else if(ch=='-' || ch=='+'){
            return 1;
        }else{
            return -1;
        }
    }
    public static String infixToPostfix(String exp) {
        // Your code here
        Stack<Character> stk = new Stack<>();
        int i = 0;
        String ans = "";
        while(i<exp.length()){
            char ch = exp.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a') && (ch<='z') || (ch>='0' && ch<='9')){
                ans += ch;
            }else if(ch=='('){
                stk.push(ch);
            }else if(ch==')'){
                while(!stk.isEmpty() && stk.peek()!='('){
                    ans += stk.pop();
                }
                stk.pop();
            }else{
                while(!stk.isEmpty() && priority(ch)<=priority(stk.peek())){
                    ans += stk.pop();
                }
                stk.push(ch);
            }
            i++;
        }
        while(!stk.isEmpty()){
            ans += stk.pop();
        }
        return ans;
    }
}