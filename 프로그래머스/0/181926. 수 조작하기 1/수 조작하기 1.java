class Solution {
    public int solution(int n, String control) {
        for(char temp : control.toCharArray())
            switch(temp){
                case 'w' : n += 1;  break;
                case 's' : n -= 1;  break;
                case 'd' : n += 10; break;
                case 'a' : n -= 10; break;
            }
        
        return n;
    }
}