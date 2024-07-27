// https://leetcode.com/problems/maximal-rectangle/description/

// 85. Maximal Rectangle

class Solution {
    public int lHist(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int maxArea = 0;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n||heights[st.peek()]>=heights[i])){
                int height = heights[st.pop()];
                int width;
                if(st.isEmpty()){
                    width = i;
                }else{
                    width = i-st.peek()-1;
                }
                maxArea = Math.max(maxArea,height*width);
            }
            st.push(i);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        if (n == 0) return 0;
        int m = matrix[0].length;
        int[] heights = new int[m];
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            ans = Math.max(ans, lHist(heights));
        }
        return ans;
    }
}