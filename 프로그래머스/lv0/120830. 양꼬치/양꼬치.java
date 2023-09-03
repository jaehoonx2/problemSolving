class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        //음료수 서비스 갯수
        int freeCnt = n/10;
        
        answer = (12000 * n) + (k - freeCnt) * 2000;
        
        return answer;
    }
}