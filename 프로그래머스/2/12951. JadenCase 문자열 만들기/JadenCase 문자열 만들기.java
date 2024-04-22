import java.lang.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        
        for(int i = 0; i < s.length(); i++){
            if(i == 0){
                if(!Character.isDigit(s.charAt(i)))
                    s = s.substring(0, 1).toUpperCase() + s.substring(1, s.length());                
            } else if(i == s.length() - 1){
                if(!Character.isDigit(s.charAt(i)) && s.charAt(i-1) == ' ')
                    s = s.substring(0, s.length()-1) + s.substring(s.length()-1, s.length()).toUpperCase(); 
            } else {
                if(!Character.isDigit(s.charAt(i)) && s.charAt(i-1) == ' ')
                    s = s.substring(0, i) + s.substring(i, i+1).toUpperCase() + s.substring(i+1, s.length());
            }
        }
        
        return s;
    }
}