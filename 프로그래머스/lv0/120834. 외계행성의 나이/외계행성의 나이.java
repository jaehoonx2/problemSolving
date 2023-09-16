class Solution {
    public String solution(int age) {
        String ageStr = String.valueOf(age);
        char[] ageCharArr = ageStr.toCharArray();
        
        for(int i = 0; i < ageCharArr.length; i++)
            ageCharArr[i] = (char) (97 + Character.getNumericValue(ageCharArr[i]));
        
        String answer = new String(ageCharArr);
        
        return answer;
    }
}