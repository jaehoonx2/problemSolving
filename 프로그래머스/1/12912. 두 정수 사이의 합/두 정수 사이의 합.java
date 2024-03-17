class Solution {
    public long solution(int a, int b) {
        if(a > b){
            int temp = b;
            b = a;
            a = temp;
        } else if(a == b) {
            return a;
        }
        
        long sum = 0;
        for(int i = a; i <= b; i++)
            sum += i;
        
        return sum;
    }
}