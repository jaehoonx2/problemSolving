import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = l; i <= r; i++){
            if(i % 5 != 0)
                continue;
            
            boolean isNotZeroFive = false;
            for(char ch : Integer.toString(i).toCharArray())
                if(ch != '0' && ch != '5')
                    isNotZeroFive = true; 
            
            if(!isNotZeroFive)
                al.add(i);
        }
        
        if(al.size() == 0)
            al.add(-1);
        
        int[] answer = new int[al.size()];
        for(int j = 0; j < answer.length; j++)
            answer[j] = al.get(j);
        
        return answer;
    }
}