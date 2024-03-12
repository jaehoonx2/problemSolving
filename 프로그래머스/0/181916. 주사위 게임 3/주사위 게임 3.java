import java.lang.Math;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = new int[]{a, b, c, d};
        int answer = 7;
        
        // 4p
        if(a == b && b == c && c == d && d == a && d == b && c == a){
            answer = 1111 * a;  
        // p q r s
        } else if(a != b && b != c && c != d && d != a && d != b && c != a){
            for(int i = 0; i < arr.length; i++)
                answer = answer > arr[i] ? arr[i] : answer;
        // 3p+1q
        } else if((a == b && b == c && c == a && d != a) ||
                (a == c && c == d && d == a && b != a) ||
                (a == b && b == d && d == a && c != a) ||
                (b == c && c == d && d == b && a != b)) {
 
            if(a == b && b == c && c == a && d != a)
                answer = (int) Math.pow((10 * a + d), 2);
            else if(a == c && c == d && d == a && b != a)
                answer = (int) Math.pow((10 * a + b), 2);
            else if(a == b && b == d && d == a && c != a)
                answer = (int) Math.pow((10 * a + c), 2);
            else if(b == c && c == d && d == b && a != b)
                answer = (int) Math.pow((10 * b + a), 2);
        // 2p+2q or 2p+1q+1r   
        } else {
            if(a == b)
                answer = (c == d) ? (a + c) * (int) Math.abs(a - c) : (c * d);
            else if(a == c) 
                answer = (b == d) ? (a + b) * (int) Math.abs(a - b) : (b * d);
            else if(a == d) 
                answer = (b == c) ? (a + b) * (int) Math.abs(a - b) : (b * c);
            else if(b == d)
                answer = (a == c) ? (a + b) * (int) Math.abs(a - b) : (a * c);
            else if(c == d)
                answer = (a == b) ? (a + c) * (int) Math.abs(a - c) : (a * b);
            else
                answer = (a == d) ? (a + b) * (int) Math.abs(a - b) : (a * d);
        }
        
        return answer;
    }
}