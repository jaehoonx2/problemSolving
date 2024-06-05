import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] menu = new int[n];

        for(int i = 0; i < n; i++)
            menu[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] freshmen = new int[m];
        int sum = 0;
        for(int i = 0; i < m; i++){
            freshmen[i] = sc.nextInt();
            sum += menu[freshmen[i] - 1];
        }

        System.out.println(sum);
    }
}