class Solution {
    public int[] solution(int[] num_list) {
        int l = num_list.length;
        int r = (l % 2 == 0) ? l/2 - 1 : l/2;
        int[] answer = new int[l];
        
        if(l == 1)
            answer = num_list;
        else {
            for(int i = 0; i <= r; i++){
                answer[i] = num_list[l-i-1];
                answer[l-i-1] = num_list[i];
            }
        }         
        return answer;
    }
}