//https://leetcode.com/problems/maximum-total-importance-of-roads/description/?envType=daily-question&envId=2024-06-28

//2285. Maximum Total Importance of Roads

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[] degree = new int[n];
        for (int[] road : roads) {
            degree[road[0]]++;
            degree[road[1]]++;
        }
        int[] frequency = new int[n];
        for (int d : degree) {
            frequency[d]++;
        }
        
        long totalImportance = 0;
        long value = 1;
        for (long i = 0; i <n; i++) {
            for (int j = 0; j < frequency[(int)i]; j++) {
                totalImportance += i * value++;
            }
        }
        return totalImportance;
    }
}