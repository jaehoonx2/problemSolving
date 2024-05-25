import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];        
        int[] b = new int[n];

        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();

            if(i == 0)
                a[i] = b[i];
            else {
                int aSum = 0;
                
                for(int j = 0; j < i; j++)
                    aSum += a[j];

                a[i] = b[i] * (i+1) - aSum;
            }

            System.out.print(a[i] + " ");
        }
    }
}