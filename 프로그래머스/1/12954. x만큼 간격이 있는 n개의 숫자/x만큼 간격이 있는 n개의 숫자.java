class Solution {
    public long[] solution(int x, int n) {
        long y = (long) x;
        long[] answer = new long[n];
        
        for(int i = 0; i < answer.length; i++)
            answer[i] = (i+1)*y;
        
        return answer;
    }
}