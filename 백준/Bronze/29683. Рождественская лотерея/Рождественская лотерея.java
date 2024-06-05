import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rub = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        int cnt = 0;
        for(int i = 0; i < arr.length; i++)
            cnt += (int) arr[i] / rub;

        System.out.println(cnt);
    }
}