import java.util.*;

class Solution {
    public String solution(String my_string) {
        List<Character> list = new ArrayList<Character>();
        for(int i = 0; i < my_string.length(); i++){
            if(!list.contains(my_string.charAt(i)))
                list.add(my_string.charAt(i));
        }
         
        char[] answer = new char[list.size()];
        for(int j = 0; j < answer.length; j++)
            answer[j] = list.get(j);
        
         return new String(answer);
    }
}