import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        Map<Character, Integer> map = new HashMap<>();
        int lowerStd = (int) 'a';
        int upperStd = (int) 'A';
        
        for(int i = 0; i < 26; i++){
            map.put((char) (upperStd + i), i);
            map.put((char) (lowerStd + i), i + 26);
        }       
        
        for(char ch : my_string.toCharArray())
            answer[map.get(ch)]++;
            
        return answer;
    }
}