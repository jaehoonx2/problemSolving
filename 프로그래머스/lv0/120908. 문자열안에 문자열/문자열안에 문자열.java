class Solution {
    public int solution(String str1, String str2) {
        int answer = (str1.indexOf(str2) < 0) ? 2 : 1; 
            
        return answer;
    }
}