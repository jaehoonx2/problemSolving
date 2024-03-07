class Solution {
    public int solution(int[] num_list) {
        String evenSum = new String();
        String oddSum = new String();
        
        for(int i : num_list){
            if(i % 2 == 0){
                evenSum += Integer.toString(i);
            } else {
                oddSum += Integer.toString(i);
            }
        }
        
        int answer = Integer.parseInt(evenSum) + Integer.parseInt(oddSum);
        
        return answer;
    }
}