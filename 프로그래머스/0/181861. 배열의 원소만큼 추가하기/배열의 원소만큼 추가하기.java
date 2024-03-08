import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i : arr){
            int cnt = i;
            while(cnt > 0){
                al.add(i);
                cnt--;
            }    
        }
            
        int[] answer = new int[al.size()];
        
        for(int j = 0; j < answer.length; j++)
            answer[j] = al.get(j);
            
        return answer;
    }
}