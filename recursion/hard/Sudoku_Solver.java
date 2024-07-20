// https://leetcode.com/problems/sudoku-solver/description/

// 37. Sudoku Solver

class Solution {
    public boolean isPut(int row,int col,char[][] board,char ch){
        for(int i=0;i<9;i++){
            if(board[i][col]==ch){
                return false;
            }
            if(board[row][i]==ch){
                return false;
            }
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==ch){
                return false;
            }
        }
        return true;
    }
    public boolean f(char[][]board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char ch = '1';ch<='9';ch++){
                        if(isPut(i,j,board,ch)){
                            board[i][j] = ch;
                            if(f(board)==true){
                                return true;
                            }else{
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        f(board);
    }
}
// time complexity is :- 2^n * k