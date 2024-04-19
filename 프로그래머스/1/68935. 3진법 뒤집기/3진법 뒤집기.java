import java.util.*;
import java.lang.*;

class Solution {
    public long solution(long n) {
        long q = n;
        long r = 0;
        String str = "";
        
        //1. 3진수 구하기
        while(q >= 3){
            r = q % 3;
            q = q / 3;
            
            str = Long.toString(r) + str; 
        }
        str = Long.toString(q) + str;
        
    	//2. 역으로 뒤집어서 10진수 바꾸기
    	long answer = 0;
    	for(int i = 0; i < str.length(); i++)
    		answer += (long) Math.pow(3, i) * (long) Character.getNumericValue(str.charAt(i));
    	
        return answer;
    }
}