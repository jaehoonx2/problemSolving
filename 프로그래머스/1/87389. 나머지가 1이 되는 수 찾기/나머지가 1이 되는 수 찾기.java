class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = n;
        
        while(x > 0){
            if(n % x == 1){
                answer = x;
            }   
            x--;
        }
        
        return answer;
    }
}