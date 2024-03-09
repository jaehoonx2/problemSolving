import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> al = new ArrayList<>();
        
        int i = 0;
        
        for(i = 0; i < finished.length; i++)
            if(!finished[i])
                al.add(todo_list[i]);
        
        for(; i < todo_list.length; i++)
            al.add(todo_list[i]);
        
        String[] answer = al.toArray(new String[al.size()]);
        
        return answer;
    }
}