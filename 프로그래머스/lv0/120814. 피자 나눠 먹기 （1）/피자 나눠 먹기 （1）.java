class Solution {
    public int solution(int n) {
        int q = n/7;
        int r = n%7;
        
        return (r > 0) ? q+1 : q;
    }
}