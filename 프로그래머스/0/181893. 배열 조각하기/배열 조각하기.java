import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int cnt = 0;    //조각할 횟수
        
        ArrayList<Integer> al = new ArrayList<>();
        for(int x : arr)
            al.add(x);
        
    
        for(int i = 0; i < query.length; i++){            
            if(i % 2 == 0){
                cnt = (al.size() - 1) - query[i];
                while(cnt > 0){
                    al.remove(al.size() - 1);
                    cnt--;
                }    
            } else {
                cnt = query[i];
                while(cnt > 0){
                    al.remove(0);
                    cnt--;
                }         
            }
        }
        
        int[] answer = new int[al.size()];
        
        for(int j = 0; j < answer.length; j++)
            answer[j] = al.get(j);
        
        return answer;
    }
}