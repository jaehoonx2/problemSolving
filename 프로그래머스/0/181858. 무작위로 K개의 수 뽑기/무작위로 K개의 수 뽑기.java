import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(al.indexOf(arr[i]) == -1)
                al.add(arr[i]);
            else
                continue;
        }
        
        int[] answer = new int[k];
        for(int j = 0; j < answer.length; j++){
            if(j + 1 <= al.size())
                answer[j] = al.get(j);
            else
                answer[j] = -1;
        }
        
        return answer;
    }
}