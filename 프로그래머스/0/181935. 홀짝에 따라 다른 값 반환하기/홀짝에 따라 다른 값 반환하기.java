class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 2 == 1){
            int temp = 1;
            while(temp <= n){
                answer += temp;
                temp += 2;
            } 
        } else {
            int temp = 2;
            while(temp <= n){
                answer += temp*temp;
                temp += 2;
            }             
        }
        
        return answer;
    }
}