class Solution {
    public String solution(String my_string, int m, int c) {
        int rowNum = my_string.length() % m == 0 ? my_string.length() / m : (my_string.length() / m) + 1;
        char[][] arr = new char[rowNum][m];
        
        int idx = 0;
        for(int i = 0; i < rowNum; i++)
            for(int j = 0; j < m; j++){
                arr[i][j] = (idx >= my_string.length()) ?  null : my_string.charAt(idx);
                idx++;
            }
        
        String answer = "";
        for(int k = 0; k < arr.length; k++)
            answer += arr[k][c-1];
        
        return answer;
    }
}