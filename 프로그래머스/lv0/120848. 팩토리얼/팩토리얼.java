class Solution {
    public int solution(int n) {        
        int i = 1;
        int iFac = 0;
        
        while(true){
            iFac = getFactorial(i);
            if(iFac >= n)
                break;
            else
                i++;
        }
        
        if(iFac > n) 
            return i-1;
        else
            return i;
    }
    
    public int getFactorial(int n){
        if(n > 1) 
            return n * getFactorial(n-1);
        else
            return 1;  
    }
}