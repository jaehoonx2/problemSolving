class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : my_string.toCharArray()){
            String s = Character.toString(c);
            if(!letter.equals(s))
                answer.append(s);
        }
            
        
        return answer.toString();
    }
}