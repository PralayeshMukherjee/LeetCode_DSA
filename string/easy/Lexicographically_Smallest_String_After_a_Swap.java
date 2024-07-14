// Lexicographically Smallest String After a Swap

class Solution {
    public String getSmallestString(String s) {
        char [] ch = s.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]%2==ch[i+1]%2){
                int a = ch[i]-'0';
                int b = ch[i+1]-'0';
                if(a>b){
                    char c = ch[i];
                    ch[i] = ch[i+1];
                    ch[i+1] = c;
                    break; 
                }
            }
        }
        return new String(ch);
    }
}