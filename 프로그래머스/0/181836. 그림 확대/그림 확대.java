class Solution {
    public String[] solution(String[] picture, int k) {
        char[][] origin = new char[picture.length][picture[0].length()];
        for(int i = 0; i < picture.length; i++)
            for(int j = 0; j < picture[i].length(); j++)
                origin[i][j] = picture[i].charAt(j);
        
        char[][] sizeUp = new char[origin.length * k][origin[0].length * k];
        for(int l = 0; l < sizeUp.length; l++)
            for(int m = 0; m < sizeUp[l].length; m++){
                sizeUp[l][m] = origin[l / k][m / k];                  
            }
        
        String[] answer = new String[picture.length * k];
        for(int n = 0; n < answer.length; n++)
            answer[n] = String.valueOf(sizeUp[n]);
        
        return answer;    
    }
}