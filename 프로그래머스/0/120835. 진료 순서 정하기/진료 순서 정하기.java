import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sorted = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(sorted);
        
        int[] answer = new int[emergency.length];
        
        for(int i = 0; i < sorted.length; i++){
            int rank = sorted.length - i;
            int degree = sorted[i];
            
            for(int j = 0; j < emergency.length; j++){
                if(degree == emergency[j]){
                    answer[j] = rank;
                    break;
                }    
            }
        }    
        
        return answer;
    }
}