class Solution {
    public int solution(int[] box, int n) {
        int maxNum[] = new int[3];
        
        for(int i = 0; i < maxNum.length; i++)
            maxNum[i] = box[i] / n;
        
        int answer = (maxNum[0] * maxNum[1] * maxNum[2]);
        
        return answer;
    }
}