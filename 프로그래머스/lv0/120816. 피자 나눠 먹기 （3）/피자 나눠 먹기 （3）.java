class Solution {
    public int solution(int slice, int n) {
        int q = n / slice;
        int r = n % slice;
        
        return (r == 0) ? q : q+1;
    }
}