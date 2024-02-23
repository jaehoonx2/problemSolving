class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0){
            answer++;
            if(answer % 3 == 0 || String.valueOf(answer).contains("3"))
                continue;
            else
                n--;
        }
        
        return answer;  
    }
}