import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();

        int f = 0;
        for(int i = 0; i < n; i++)
            f += sc.nextInt();

        System.out.println(f >= t ? "Padaeng_i Happy" : "Padaeng_i Cry");        
    }
}