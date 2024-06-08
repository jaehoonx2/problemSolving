import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        int hd = 0;
        
        for(int i = 0; i < s.length(); i++)
            hd += s.charAt(i) != t.charAt(i) ? 1 : 0;

        System.out.println(hd);
    }
}