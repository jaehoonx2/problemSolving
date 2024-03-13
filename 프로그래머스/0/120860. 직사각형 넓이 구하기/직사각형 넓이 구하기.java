import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        int width  = 0;
        int height = 0;
        int[] xy = { dots[0][0], dots[0][1] };

        for(int i = 1; i < dots.length; i++){
            if(xy[0] == dots[i][0])
                height = Math.abs(xy[1] - dots[i][1]);
            else if(xy[1] == dots[i][1])
                width = Math.abs(xy[0] - dots[i][0]);
            else
                continue;
        }
        
        return height * width;
    }
}