import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();

        int v1 = n - v > v ? n - v : v;
        int h1 = n - h > h ? n - h : h;
        
        System.out.println(v1 * h1 * 4);
    }
}