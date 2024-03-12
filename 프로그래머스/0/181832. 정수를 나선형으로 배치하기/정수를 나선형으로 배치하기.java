class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int row = 0;
        int col = 0;        
        
        int number = 1;
        
        boolean left  = false;
        boolean right = false;
        boolean up    = false;
        boolean down  = false;        
        
        while(number <= n*n) {
            //1. 마킹
            answer[row][col] = number;
            
            //2. 다음 마킹방향 구하기
            if(col == 0){
                if(row == 0)
                    col += 1;
                else if(row == n-1)
                    row -= 1;
                else {                           
                    if(answer[row-1][col] == 0)
                        row -= 1;
                    else
                        col += 1;
               } 
            } else if(col == n-1) {
                if(row == 0)
                    row += 1;
                else if(row == n-1)
                    col -= 1;
                else
                    row += 1;
            } else {
                if(row == 0)
                    col += 1;
                else if(row == n-1)
                    col -= 1;
                else {
                    right = answer[row][col+1] == 0 ? true : false;
                    left  = answer[row][col-1] == 0 ? true : false;
                    up    = answer[row-1][col] == 0 ? true : false;
                    down  = answer[row+1][col] == 0 ? true : false;

                    if(right){
                        if(up)
                            row -= 1;
                        else
                            col += 1;
                    } else if(left) {
                        if(down)
                            row += 1;
                        else
                            col -= 1;
                    } else {
                        if(down)
                            row += 1;
                        else
                            row -= 1;
                    }
                }
            }               
            number++;
        }      
        return answer;
    }
}