import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Deque<Integer> dq = new LinkedList<>();
        
        for(int i = 0; i < arr.length; i++){
            int cnt;
            
            if(flag[i]){
                cnt = arr[i] * 2;
                
                while(cnt > 0){
                    dq.addLast(arr[i]);
                    cnt--;
                }
            } else {
                cnt = arr[i];
                
                while(cnt > 0){
                    dq.removeLast();
                    cnt--;
                }
            }
        }
        
        int[] answer = new int[dq.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = dq.pop();
        }
                
        return answer;
    }
}