class Solution {
    public int[] solution(int[] num_list) {
        for(int i = 0; i < 5; i++){
            for(int j = i + 1; j < num_list.length; j++){
                if(num_list[j] <= num_list[i]){
                    int temp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = temp;
                } else
                    continue;
            }
        }
        
        int[] answer = {num_list[0], num_list[1], num_list[2], num_list[3], num_list[4]};
        
        return answer;
    }
}