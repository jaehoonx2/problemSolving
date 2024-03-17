import java.util.ArrayList;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        
        int[] cnt = new int[10];
        for(char ch : str.toCharArray()){
            switch(ch){
                case '0' : cnt[0]++; break;
                case '1' : cnt[1]++; break;
                case '2' : cnt[2]++; break;
                case '3' : cnt[3]++; break;                   
                case '4' : cnt[4]++; break;
                case '5' : cnt[5]++; break;   
                case '6' : cnt[6]++; break;
                case '7' : cnt[7]++; break;
                case '8' : cnt[8]++; break;
                case '9' : cnt[9]++; break;                  
            }
        }
        
        String answer = new String();
        
        for(int i = cnt.length - 1; i >= 0; i--)
            answer += Integer.toString(i).repeat(cnt[i]); 
        
        return Long.parseLong(answer);
    }
}