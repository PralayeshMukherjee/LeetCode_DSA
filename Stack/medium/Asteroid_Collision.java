//https://leetcode.com/problems/asteroid-collision/description/?envType=study-plan-v2&envId=leetcode-75

// 735. Asteroid Collision
import java.util.*;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // create a stack
        Stack<Integer> stk = new Stack<>();
        // traverse all element in an array
        for(int n:asteroids){
            // if element is greater than zero then simple push
            if(n>0){
                stk.push(n);
            }else{
                // if less than zero then 3 condition occres
                // if peek is positive but smaller than positive value of n then pop it out
                while(!stk.isEmpty() && stk.peek()>0 && stk.peek()<-n){
                    stk.pop();
                }
                // if stack is empty and the peek value is less than zero then push it
                if(stk.empty() || stk.peek()<0){
                    stk.push(n);
                }
                // if stack peek value is same as positive value of n then pop it out
                if(stk.peek()==-n){
                    stk.pop();
                }
            }
        }
        // create an array to pop the value
        int arr[] = new int[stk.size()];
        // start push from end of the array
        int i = stk.size()-1;
        // push value in the array that you pop out from the stack until stack is empty
        while(!stk.isEmpty()){
            arr[i] = stk.pop();
            i--;
        }
        return arr;
    }
}
// approach two
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(asteroids[i])){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==Math.abs(asteroids[i])){
                    st.pop();
                }else if(st.isEmpty() || st.peek()<0){
                    st.push(asteroids[i]);
                }
            }
        }
        int arr[] = new int[st.size()];
        int i = st.size()-1;
        while(!st.isEmpty() && i>=0){
            arr[i] = st.pop();
            i--;
        }
        return arr;
    }
}
// time complexity is :- O(n)+O(n)+(n)= O(3n)
// space complexity is : O(n)+O(n) = O(2n)