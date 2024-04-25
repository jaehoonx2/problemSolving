import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Set<Character> set = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++){
            if(!set.contains(s.charAt(i))){
                answer[i] = -1;
            } else {
                int j = i - 1;
                int cnt = 1;
                while(s.charAt(j) != s.charAt(i)){
                    j--;
                    cnt++;
                }
                
                answer[i] = cnt;
            }
            
            set.add(s.charAt(i));
        }
            
        return answer;
    }
}