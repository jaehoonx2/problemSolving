import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i = 0; i < intervals.length; i++){
            for(int j = 0; j < arr.length; j++)
                if(j >= intervals[i][0] && j <= intervals[i][1])
                    al.add(arr[j]);
        }
        
        int[] answer = new int[al.size()];
        for(int k = 0; k < answer.length; k++)
            answer[k] = al.get(k);
        
        return answer;
    }
}