import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < queries.length; i++){
            int min =  1000000;

            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                if(arr[j] > queries[i][2])
                    min = (arr[j] < min) ? arr[j] : min;
            }
            
            al.add(min == 1000000 ? -1 : min);
        }
        
        int[] answer = new int[al.size()];
        
        for(int l = 0; l < answer.length; l++)
            answer[l] = al.get(l);
        
        return answer;
    }
}