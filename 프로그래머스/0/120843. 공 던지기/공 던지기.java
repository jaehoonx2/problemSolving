class Solution {
    public int solution(int[] numbers, int k) {
        int idx = 0;
        
        for(int i = 1; i <= k; i++){
            if(i == k)
                break;
            else if(idx + 2 == numbers.length)
                idx = 0;
            else if(idx + 2 == numbers.length + 1)
                idx = 1;
            else
                idx += 2;
        }
        
        return numbers[idx];
    }
}