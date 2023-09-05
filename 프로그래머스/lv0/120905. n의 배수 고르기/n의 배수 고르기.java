import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int n, int[] numlist) {
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < numlist.length; i++)
            if(numlist[i] % n == 0)
                queue.add(numlist[i]);

        int[] answer = new int[queue.size()];
        
        for(int i = 0; i < answer.length; i++)
            answer[i] = queue.remove();
        
        return answer;
    }
}