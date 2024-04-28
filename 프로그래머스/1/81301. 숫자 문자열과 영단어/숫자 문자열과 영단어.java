import java.util.*;

class Solution {
    public int solution(String s) {
        ArrayList<String> al = new ArrayList<>();
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);     
        
        Set<String> set = map.keySet();
        
        
        while(s.length() != 0){
            if(Character.isDigit(s.charAt(0))){
                al.add(Character.toString(s.charAt(0)));
                s = s.substring(1, s.length());
            } else {
                Iterator<String> it = set.iterator();
                while(it.hasNext()){
                    String str = it.next();
                    
                    if(s.startsWith(str)){
                        al.add(Integer.toString(map.get(str)));
                        s = s.substring(str.length(), s.length());
                        break;
                    } 
                }                
            }
        }
        
        for(int i = 0; i < al.size(); i++)
            answer += al.get(i);
        
        return Integer.parseInt(answer);
    }
}