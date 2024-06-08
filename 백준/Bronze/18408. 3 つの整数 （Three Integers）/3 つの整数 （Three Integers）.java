import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt1 = 0;
        int cnt2 = 0;
        
        while(sc.hasNext())
            if(sc.nextInt() == 1)
                cnt1++;
            else
                cnt2++;

        System.out.println(cnt2 > cnt1 ? "2" : "1");
    }
}