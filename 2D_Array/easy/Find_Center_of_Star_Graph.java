//https://leetcode.com/problems/find-center-of-star-graph/description/?envType=daily-question&envId=2024-06-27

// 1791. Find Center of Star Graph

class Solution {
    public int findCenter(int[][] edges) {
        if((edges[0][0]==edges[1][1]) || edges[0][0]==edges[1][0]){
            return edges[0][0];
        }else{
            return edges[0][1];
        }
    }
}