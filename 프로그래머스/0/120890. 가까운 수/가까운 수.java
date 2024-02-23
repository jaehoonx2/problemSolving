import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int absDiff = 999;
        
        for(int i = 0; i < array.length; i++){
            int temp = Math.abs(array[i] - n);
            
            if(temp < absDiff || ((temp == absDiff && array[i] < answer))){
                absDiff = temp;
                answer = array[i];
            }
        }
        return answer;
    }
}