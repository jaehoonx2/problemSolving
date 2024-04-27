import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);        
            }
        }
        
        int[] answer = new int[set.size()];
        Iterator it = set.iterator();
        int i = 0;
        while(it.hasNext()){
            int num = (int) it.next();
            answer[i] = num;
            i++;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}