//https://leetcode.com/problems/pass-the-pillow/?envType=daily-question&envId=2024-07-06

//2582. Pass the Pillow

class Solution {
    public int passThePillow(int n, int time) {
        int direction = -1,count = 0,st=1;
        while(count!=time){
            if(st==n || st==1){
                direction *= -1;
            }
            st += direction;
            count++;
        }
        return st;
    }
}
