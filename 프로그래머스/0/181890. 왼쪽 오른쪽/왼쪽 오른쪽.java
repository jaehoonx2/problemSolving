import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> al = new ArrayList<>();
        
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                if(i != 0) {
                    for(int j = 0; j < i; j++)
                        al.add(str_list[j]);
                    
                    return al.toArray(new String[al.size()]);
                } else
                    return new String[]{};
            } else if(str_list[i].equals("r")) {
                if(i != str_list.length - 1) {
                    for(int j = i+1; j < str_list.length; j++)
                        al.add(str_list[j]);
                    
                    return al.toArray(new String[al.size()]);                    
                } else
                    return new String[]{};              
            } else
                continue;
        }
        
        return new String[]{};
    }
}