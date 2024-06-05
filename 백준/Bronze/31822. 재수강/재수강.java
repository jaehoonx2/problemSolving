import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String retake = sc.next();
        int n = sc.nextInt();

        String[] code = new String[n];
        int cnt = 0;
        
        for(int i = 0; i < code.length; i++){
            code[i] = sc.next();
            if(code[i].substring(0, 5).equals(retake.substring(0, 5)))
                cnt++;
        }
        System.out.println(cnt);
    }
}