class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        while(myString.length() >= pat.length() && myString.length() >= 1){
            answer += (myString.substring(0, pat.length()).equals(pat)) ? 1 : 0;
            
            if(myString.length() != 1)
                myString = myString.substring(1, myString.length());
            else
                break;
        }
            
        return answer;
    }
}