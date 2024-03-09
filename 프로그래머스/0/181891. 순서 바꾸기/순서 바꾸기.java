import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {        
        Queue<Integer> queue = new LinkedList<>();
        int[] answer = new int[num_list.length];
        
        for(int i : num_list)
            queue.add(i);
        
        for(int j = 0; j < n; j++){
            int temp = queue.poll();
            queue.add(temp);
        }
        
        for(int k = 0; k < answer.length; k++)
            answer[k] = queue.poll();
        
        return answer;
    }
}