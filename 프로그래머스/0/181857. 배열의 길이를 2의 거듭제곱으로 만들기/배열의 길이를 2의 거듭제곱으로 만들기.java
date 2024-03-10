import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i : arr)
            al.add(i);
        
        while(true){
            if(isPowOf2(al.size()))
                break;
            else
                al.add(0);
        }
        
        int[] answer = new int[al.size()];
        for(int j = 0; j < answer.length; j++)
            answer[j] = al.get(j);
        
        return answer;
    }
    
    public boolean isPowOf2(int x) {
        double log2 = Math.log((double) x) / Math.log(2.0);
        
        return log2 == (int) log2 ? true : false;
    }
}