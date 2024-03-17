class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++)
            answer += getDivisorsCnt(i) % 2 == 0 ? i : -i;
        
        return answer;
    }
    
    public int getDivisorsCnt(int num) {
        int cnt = 0;
        
        for(int i = 1; i <= num; i++)
            cnt += num % i == 0 ? 1 : 0;
        
        return cnt;
    }
}