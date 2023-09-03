class Solution {
    public int[] solution(int[] num_list) {
        int oddNum = 0;
        int evenNum = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i]%2 == 0)
                evenNum++;
            else
                oddNum++;
        }
        
        int[] answer = {evenNum, oddNum};
        
        return answer;
    }
}