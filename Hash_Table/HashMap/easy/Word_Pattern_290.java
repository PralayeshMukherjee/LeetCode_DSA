// https://leetcode.com/problems/word-pattern/description/
// 290. Word Pattern

import java.util.*;
class Solution {
    public static boolean wordPattern(String pattern, String s) {
        // break the s string in the word wise(which is also a string) because I map here character to string
        String [] word = s.split(" ");
        // every charcter of pattern map with every element of word array if the length is inequal then it is worng
    
        if(pattern.length()!=word.length) return false;
    
        HashMap<Character,String> map = new HashMap<>();
        // iterate throgh pattern and word array for mapping
        for(int i=0;i<word.length;i++){
            char ch = pattern.charAt(i);
    
            // late take 1st example:- a -> dog then b->cat then map have 'a' key so cheak at index i word have dog or other. If dog then it okay because a already map with "dog" but if at index i the element is "rat" then we return false because here a -> rat which is worng. Here at index i it is "dog" so we go for next itoration which same for 'b'.
    
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word[i])){
                    return false;
                }
            }else{
                // but if a -> dog and b -> dog then it is wrong so I check that word[i] already exsist in my map or not. If yes then return false
    
                if(map.containsValue(word[i])){
                    return false;
                }
                map.put(ch,word[i]);
            }
        }
        // if we iterate all the values without any exception then return true
        return true;
    
        // time complexity :- O(n)
        // space complexity :- O(n)
    }
}
     