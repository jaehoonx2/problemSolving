import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for(String str : intStrs){
            int num = Integer.parseInt(str.substring(s, s + l));
            if(num > k)
                al.add(num);
            else
                continue;
        }
        
        int[] answer = new int[al.size()];
        for(int i = 0; i < answer.length; i++)
            answer[i] = al.get(i);
        
        return answer;
    }
}