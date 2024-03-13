class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int leftEnd  = -1 * ((board[0] - 1) / 2);
        int rightEnd = (board[0] - 1) / 2;
        int upEnd    = (board[1] - 1) / 2;
        int downEnd  = -1 * ((board[1] - 1) / 2);
        
        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("left"))
                answer[0] = answer[0] - 1 < leftEnd  ? answer[0] : answer[0] - 1; 
            else if(keyinput[i].equals("right"))
                answer[0] = answer[0] + 1 > rightEnd ? answer[0] : answer[0] + 1; 
            else if(keyinput[i].equals("up"))
                answer[1] = answer[1] + 1 > upEnd    ? answer[1] : answer[1] + 1; 
            else
                answer[1] = answer[1] - 1 < downEnd  ? answer[1] : answer[1] - 1; 
        }
        
        return answer;
    }
}