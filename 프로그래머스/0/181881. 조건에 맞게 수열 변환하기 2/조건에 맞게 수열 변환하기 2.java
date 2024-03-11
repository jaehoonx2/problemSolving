import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] temp = Arrays.copyOf(arr, arr.length);
        
        while(true){
            temp = Arrays.copyOf(arr, arr.length);
            
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0)
                    arr[i] /= 2;
                else if(arr[i] < 50 && arr[i] % 2 == 1)
                    arr[i] = arr[i] * 2 + 1;
            }
            
            answer++;
             
            if(Arrays.equals(arr, temp))
                return answer - 1;
            else
                continue;
        }
    }
}