import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String str : completion){
            int cnt = map.containsKey(str) ? map.get(str) + 1 : 1;
            map.put(str, cnt);
        }
            
        
        for(String str : participant)
            if(!map.containsKey(str))
                return str;
            else if(map.get(str) > 0)
                map.replace(str, map.get(str) - 1);
            else
                return str;
        
        return new String();
    }
}