import java.util.*;

class Solution {
    public String[] solution(String myString) {
        ArrayList<String> al = new ArrayList<>();
        String[] split = myString.split("x");
        
        for(String str : split)
            if(!str.equals(""))
                al.add(str);
        
        String[] answer = al.toArray(new String[al.size()]);
        
        Arrays.sort(answer);
        
        return answer;
    }
}