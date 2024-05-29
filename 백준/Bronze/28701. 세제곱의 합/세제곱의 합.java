import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long nSumSquare = (n*(n+1)/2) * (n*(n+1)/2);
        long nCubeSum = 0;

        for(int i = 1; i <= n; i++)
            nCubeSum += (i*i*i);

        System.out.println(n*(n+1)/2);
        System.out.println(nSumSquare);
        System.out.println(nCubeSum);
    }
}