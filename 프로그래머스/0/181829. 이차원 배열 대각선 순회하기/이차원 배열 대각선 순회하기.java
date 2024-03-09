class Solution {
    public int solution(int[][] board, int k) {
        int sum = 0;
        
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[i].length; j++)
                sum += (i + j <= k) ? board[i][j] : 0;
        
        return sum;
    }
}