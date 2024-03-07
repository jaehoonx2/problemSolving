class Solution {
    public String solution(String myString) {
        String answer = new String();
        
        for(int i = 0; i < myString.length(); i++){
            char letter = myString.charAt(i);
            
            if(Character.isUpperCase(letter))
                letter = Character.toLowerCase(letter);
            
            answer += Character.toString(letter);
        }
        
        return answer;
    }
}