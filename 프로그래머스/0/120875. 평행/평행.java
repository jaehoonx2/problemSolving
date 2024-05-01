// [[10, 1], [9, 3], [2, 2], [4, 4]]
class Solution {
    public int solution(int[][] dots) {
        if(getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3])){
            return 1;
        } else if(getSlope(dots[0], dots[2]) == getSlope(dots[1], dots[3])) {
            return 1;
        } else if(getSlope(dots[0], dots[3]) == getSlope(dots[1], dots[2])) {
            return 1;
        } else
            return 0;
    }
    
    public double getSlope(int[] p1, int[] p2){
        return (double) (p2[1] - p1[1]) / (p2[0] - p1[0]);
    }
}