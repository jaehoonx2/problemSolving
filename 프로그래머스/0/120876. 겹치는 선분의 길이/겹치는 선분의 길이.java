import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] xCoord = new int[201]; // x좌표 (-100 ~ 100)
        
        for(int i = 0; i < xCoord.length; i++){
            int cnt = 0;        // 구간이 겹치는 횟수
            
            int idx = i - 100;  // i를 x좌표 값으로 변환 -100 ~ 100
            cnt += getCommonSectionLength(new int[]{idx, idx+1}, lines[0]) > 0 ? 1 : 0;
            cnt += getCommonSectionLength(new int[]{idx, idx+1}, lines[1]) > 0 ? 1 : 0;
            cnt += getCommonSectionLength(new int[]{idx, idx+1}, lines[2]) > 0 ? 1 : 0;
            
            answer += cnt > 1 ? 1 : 0;
        }
        
        return answer;
    }
    
    public int getCommonSectionLength(int[] line1, int[] line2){
        int start = line1[0] > line2[0] ? line1[0] : line2[0];
        int end = line1[1] < line2[1] ? line1[1] : line2[1];
        
        if(end <= start)
            return 0;
        else
            return end - start;
    }
}