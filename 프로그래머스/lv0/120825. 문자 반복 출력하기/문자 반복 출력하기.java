class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        char[] chars = my_string.toCharArray();
        
        for (int i = 0; i < chars.length; i++)
            for(int j = 0; j < n; j++)
            answer.append(chars[i]);
            
        return answer.toString();
    }
}