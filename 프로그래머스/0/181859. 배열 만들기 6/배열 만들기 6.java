import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        Stack<Integer> stk = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            if(stk.size() == 0){
                stk.push(arr[i]);
            } else if(stk.peek() == arr[i]){
                stk.pop();
            } else {
                stk.push(arr[i]);
            }
        }
        
        if(stk.size() == 0)
            return new int[]{-1};
        
        answer = new int[stk.size()];
        for(int j = answer.length - 1; j >= 0; j--)
            answer[j] = stk.pop();
                
        return answer;
    }
}