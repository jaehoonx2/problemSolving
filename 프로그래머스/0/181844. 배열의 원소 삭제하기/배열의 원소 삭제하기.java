import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        LinkedList<Integer> ll = new LinkedList<>();
        
        for(int i : arr)
            ll.add(i);
        
        for(int j = 0; j < delete_list.length; j++){
            int idx = ll.indexOf(delete_list[j]);
            
            if(idx > -1)
                ll.remove(idx);
        }
        
        int[] answer = new int[ll.size()];
        for(int k = 0; k < answer.length; k++)
            answer[k] = ll.get(k);
        
        return answer;
    }
}