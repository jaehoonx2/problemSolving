import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        long n = sc.nextLong();
        long answer = factorial(n) / 60 / 60 / 24 / 7;
        System.out.println(answer);
    }

    public static long factorial(long n) {
        return n > 1 ? n * factorial(n - 1) : 1;
    }
}