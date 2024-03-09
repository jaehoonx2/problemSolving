class Solution {
    public int[] solution(String myString) {
        boolean isLastCharX = myString.charAt(myString.length() - 1) == 'x' ? true : false;
        String[] str = myString.split("x");
        int[] answer = new int[isLastCharX ? str.length + 1 : str.length];
        
        for(int i = 0; i < answer.length; i++){
            if(isLastCharX && i == answer.length - 1)
                answer[i] = 0;
            else
                answer[i] = str[i].length();
        }
        
        return answer;
    }
}