class Solution {
    public int[][] solution(int[][] arr) {
        int rowNum = arr.length;
        int colNum = arr[0].length;
        int[][] answer = (rowNum > colNum) ? new int[rowNum][rowNum] : ((colNum > rowNum) ? new int[colNum][colNum] : arr);
        
        if(rowNum > colNum){
            for(int i = 0; i < arr.length; i++)
                for(int j = 0; j < arr[i].length; j++){
                    answer[i][j] = (j < colNum) ? arr[i][j] : 0;
                }
        } else if(rowNum < colNum) {
            for(int k = 0; k < arr.length; k++)
                for(int l = 0; l < arr[k].length; l++){
                    answer[k][l] = (k < rowNum) ? arr[k][l] : 0;
                }            
        }
        
        return answer;
    }
}