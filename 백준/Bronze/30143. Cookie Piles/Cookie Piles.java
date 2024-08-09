import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int d = sc.nextInt();
    
            double answer = 0.5 * n * (2 * a + (n-1) * d);
    
            System.out.println((int)answer);
        }
    }
}