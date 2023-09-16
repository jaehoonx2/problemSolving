class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] charArr = my_string.toCharArray();
        
        char tmp = charArr[num1];
        charArr[num1] = charArr[num2];
        charArr[num2] = tmp;
        
        String answer = new String(charArr);
        
        return answer;
    }
}