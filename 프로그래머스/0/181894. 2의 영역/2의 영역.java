import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int minIdx = -1;
        int maxIdx = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                minIdx = i;
                break;
            }
        }
        
        for(int j = arr.length - 1; j >= 0; j--){
            if(arr[j] == 2){
                maxIdx = j;
                break;
            }
        }
        
        if(minIdx == -1 || maxIdx == -1)
            return new int[] {-1};
        else {
            return Arrays.copyOfRange(arr, minIdx, maxIdx + 1);
        }
            
    }
}