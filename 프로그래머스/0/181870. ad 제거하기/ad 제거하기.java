import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> al = new ArrayList<>();
        
        for(String str : strArr)
            if(!str.contains("ad"))
                al.add(str);
        
        String[] answer = al.toArray(new String[al.size()]);
        
        return answer;
    }
}