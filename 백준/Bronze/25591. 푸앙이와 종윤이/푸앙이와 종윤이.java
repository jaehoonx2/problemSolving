import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int a = 100 - n1;
        int b = 100 - n2;

        int c = 100 - (a+b);
        int d = a*b;

        int q = d / 100;
        int r = d % 100;
    
        System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
        System.out.println(c+q + " " + r);
    }
}