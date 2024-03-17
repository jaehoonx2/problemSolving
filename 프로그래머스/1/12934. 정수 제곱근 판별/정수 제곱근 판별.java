import java.lang.Math;

class Solution {
    public long solution(long n) {
        Double rtVal = Math.sqrt(n);
        
        if(rtVal == Math.floor(rtVal))
            return (long) Math.pow(rtVal + 1, 2);
        else
            return -1;
    }
}