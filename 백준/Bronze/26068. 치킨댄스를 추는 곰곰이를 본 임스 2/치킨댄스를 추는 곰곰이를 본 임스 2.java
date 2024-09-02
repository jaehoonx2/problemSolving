import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while(n-- > 0){
            String str = sc.next();
            if(Integer.parseInt(str.substring(2)) <= 90)
                cnt++;
        }
        System.out.println(cnt);
    }
}