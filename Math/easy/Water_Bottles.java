// https://leetcode.com/problems/water-bottles/description/?envType=daily-question&envId=2024-07-07

// 1518. Water Bottles

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        while(numBottles>=numExchange){
            total += numBottles/numExchange;
            numBottles = (numBottles/numExchange) + (numBottles%numExchange);
        }
        return total;
    }
}