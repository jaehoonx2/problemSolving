import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = new String();
        
        int idx = 0;
        while(idx < str.length()){
            answer += str.charAt(idx);
            int distance = (int) answer.charAt(answer.length() - 1) -(int) 'A' + 1;
            idx += distance;
        }
        
        System.out.println(answer);
    }
}