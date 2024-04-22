import java.lang.*;

class Solution {
    public int solution(int n) {
        int cnt = 0;
        
        for(int i = 2; i <= n; i++)
            if(isPrime(i))
                cnt++;
        
        return cnt;
    }
    
    public boolean isPrime(int n) {
        for(int i = 2; i < (int) Math.sqrt(n) + 1; i++){
            if(n % i == 0)
                return false;
        }
        
        return true;
    }
}