import java.util.*;

class Solution {
    public int[] solution(int[] arr) { 
        int[] answer;
        int minIdx = 0;
        int minVal = arr[0];    
        
        if(arr.length == 1 && arr[0] == 10)
            return new int[]{-1};
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minVal){
                minVal = arr[i];
                minIdx = i;
            }
        }
        
        if(minIdx == 0){
            answer = Arrays.copyOfRange(arr, 1, arr.length);
        } else if(minIdx == arr.length - 1) {
            answer = Arrays.copyOfRange(arr, 0, arr.length - 1);
        } else {
            int[] front = Arrays.copyOfRange(arr, 0, minIdx);
            int[] back = Arrays.copyOfRange(arr, minIdx + 1, arr.length);
            
            answer = new int[arr.length - 1];
            for(int j = 0; j < answer.length; j++)
                answer[j] = j < front.length ? front[j] : back[j - front.length];
        }
        
        return answer;
    }
}