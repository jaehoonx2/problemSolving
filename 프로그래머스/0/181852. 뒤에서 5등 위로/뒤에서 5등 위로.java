import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        for(int i = 0; i < num_list.length - 1; i++){
            for(int j = i + 1; j < num_list.length; j++){
                if(num_list[j] <= num_list[i]){
                    int temp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = temp;
                } else
                    continue;
            }
        }
        
        int[] answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        
        return answer;
    }
}