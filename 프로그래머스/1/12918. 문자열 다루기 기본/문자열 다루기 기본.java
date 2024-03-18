class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6)
            return false;
        else {
            for(char ch : s.toCharArray())
                if(!Character.isDigit(ch))
                    return false;
        }
        
        return true;
    }
}