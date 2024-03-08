import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(n));
        
        while(n > 1){         
            if(n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
            
            arrayList.add(n);
        }
        
        int[] answer = new int[arrayList.size()];
        
        for(int i = 0; i < answer.length; i++)
            answer[i] = arrayList.get(i);

        return answer;
    }
}