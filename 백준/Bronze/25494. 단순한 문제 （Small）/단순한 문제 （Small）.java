import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int cnt = 0;

            for(int i = 1; i <= a; i++)
                for(int j = 1; j <= b; j++)
                    for(int k = 1; k <= c; k++)
                        cnt += ((i % j) == (j % k) && (j % k) == (k % i)) ? 1 : 0;
                    
            System.out.println(cnt);
        }
    }
}