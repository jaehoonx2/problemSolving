import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();

        long answer = n-m < 0 ? -1 * (n-m) : n-m;

        System.out.println(answer);
    }
}