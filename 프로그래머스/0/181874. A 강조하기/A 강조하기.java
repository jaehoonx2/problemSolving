class Solution {
    public String solution(String myString) {
        String answer = new String();
        myString = myString.replace("a", "A");
        
        for(char ch : myString.toCharArray()){
            if(ch != 'A')
                ch = Character.toLowerCase(ch);
            
            answer += ch;
        }
        
        return answer;
    }
}