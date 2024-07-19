//https://leetcode.com/problems/n-queens/description/

// 51. N-Queens
import java.util.List;
import java.util.ArrayList;;
class Solution {
    public boolean isPut(int row,int col,char[][] board,int n){
        int dublicatRow1 = row;
        int dublicateCol1 = col;

        while(dublicatRow1>=0 && dublicateCol1>=0){
            if(board[dublicatRow1][dublicateCol1]=='Q'){
                return false;
            }
            dublicatRow1--;
            dublicateCol1--;
        }

        int dublicatRow2 = row;
        int dublicateCol2 = col;

        while(dublicateCol2>=0){
            if(board[dublicatRow2][dublicateCol2]=='Q'){
                return false;
            }
            dublicateCol2--;
        }

        int dublicatRow3 = row;
        int dublicateCol3 = col;

        while(dublicateCol3>=0 && dublicatRow3<n){
            if(board[dublicatRow3][dublicateCol3]=='Q'){
                return false;
            }
            dublicateCol3--;
            dublicatRow3++;
        }
        return true;
    }
    public void f(int col,char[][] board,List<List<String>> ans,int n){
        if(col==n){
            List <String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String s = new String(board[i]);
                temp.add(s);
            }
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int row = 0;row<n;row++){
            if(isPut(row,col,board,n)){
                board[row][col] = 'Q';
                f(col+1,board,ans,n);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        f(0,board,ans,n);
        return ans;
    }
}