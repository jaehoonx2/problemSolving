import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            triangle(n);
        }
    }

    public static void triangle(int n) {
        for(int i = 1; i <= n; i++)
            System.out.println("*".repeat(i));
    }
}