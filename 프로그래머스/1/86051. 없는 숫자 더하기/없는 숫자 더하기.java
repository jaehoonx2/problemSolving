class Solution {
    public int solution(int[] numbers) {
        int[] cnt = new int[10];
        int answer = 0;
        
        for(int i = 0; i < numbers.length; i++)
             for(int j = 0; j < cnt.length; j++){
                cnt[j] += numbers[i] == j ? 1 : 0; 
             }
            
        
        for(int i = 0; i < cnt.length; i++)
            answer += cnt[i] == 0 ? i : 0;
        
        return answer;
    }
}