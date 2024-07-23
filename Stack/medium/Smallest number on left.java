// https://www.geeksforgeeks.org/problems/smallest-number-on-left3403/1

// Smallest number on left
class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        Stack<Integer> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<n){
            while(!st.isEmpty() && st.peek()>=a[i]){
                st.pop();
            }
            if(st.isEmpty()){
                list.add(-1);
            }else{
                list.add(st.peek());
            }
            st.push(a[i]);
            i++;
        }
        return list;
    }
}