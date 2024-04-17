class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ", -1);
        
        for(int i = 0; i < arr.length; i++){
            char[] ch = arr[i].toCharArray();
            
            for(int j = 0; j < ch.length; j++)
                ch[j] = j % 2 == 0 ? Character.toUpperCase(ch[j]) : Character.toLowerCase(ch[j]);
                
            arr[i] = new String(ch);    
        }
        
        String answer = arr[0];
        for(int i = 1; i < arr.length; i++)
            answer += " " + arr[i];
        
        return answer;
    }
}