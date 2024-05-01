import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(int i = 0; i < babbling.length; i++){
            String str = babbling[i];
            

            if(str.length() == 1 || str.length() == 9 || str.length() > 10)
            	continue;
            
            Set<String> set = new HashSet<>();
            
            int cnt = 0; 
            while(cnt < 4){
                for(int j = 0; j < words.length; j++){
                    if(str.startsWith(words[j]) && !set.contains(words[j])){
                        set.add(words[j]);
                        str = str.substring(words[j].length());
                        break;
                    }
                }
                cnt++;
            }

            if(str.length() == 0)
                answer += 1;
        }
        
        return answer;
    }
}