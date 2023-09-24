import java.util.*;

class Solution {
    public String solution(String letter) {
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashMap<String, Character> map = new HashMap<String, Character>();
        for(int i = 0; i < morse.length; i++){
            int val = 97 + i;
            char askiiVal = (char) val;
            map.put(morse[i], Character.valueOf(askiiVal));
        }    
    
        String[] letters = letter.split(" ");
        char arr[] = new char[letters.length];
        
        for(int j = 0; j < letters.length; j++)
            arr[j] = map.get(letters[j]);
        
        return new String(arr);
    }
}