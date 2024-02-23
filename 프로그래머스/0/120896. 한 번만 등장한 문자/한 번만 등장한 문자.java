import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        String str = new String();
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.replace(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        
        for(Character key : map.keySet()) {
           int value = map.get(key);
            if(value == 1)
                str += Character.toString(key);
        }
        
        char[] newArr = str.toCharArray();
        Arrays.sort(newArr);
        String ans = String.valueOf(newArr);
        
        return ans;
    }
}