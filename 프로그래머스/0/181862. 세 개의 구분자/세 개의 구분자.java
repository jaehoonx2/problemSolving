import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> al = new ArrayList<>();
        
        String temp = "";
        for(int i = 0; i < myStr.length(); i++){
            char ch = myStr.charAt(i);
            
            if(ch == 'a' || ch == 'b' || ch == 'c'){
                if(!temp.equals(""))
                    al.add(temp);

                temp = "";
            } else {
                temp += ch;
                
                if(i == myStr.length() - 1)
                    al.add(temp);
            }
        }

        if(al.size() == 0) {
            String[] answer = {"EMPTY"};
            return answer;
        } else {
            String[] answer = al.toArray(new String[al.size()]);
            return answer;
        }
    }
}