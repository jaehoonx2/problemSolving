import java.util.*;

class Solution {
    public String solution(String s) {
        // Map<Character, Integer>
        // z y x     d  c  b  a  Z  X      C  B  A 
        // 0 1 2 ... 23 24 25 26 27 28 ... 49 50 51        
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < 52; i++){
            int std = i < 26 ? (int) 'z' : (int) 'Z';
            int ch = i < 26 ? std - i :  std - i + 26;
            map.put((char) ch, i);
        }

        int[] arr = new int[s.length()];
        for(int i = 0; i < s.length(); i++)
            arr[i] = map.get(s.charAt(i));    
        
        Arrays.sort(arr);
        
        
        String answer = "";
        for(int j = 0; j < arr.length; j++){
            int idx = arr[j] < 26 ? (int) 'z' - arr[j] : (int) 'Z' - arr[j] + 26;
            answer += (char) idx;
        }
        
        return answer;
    }
}