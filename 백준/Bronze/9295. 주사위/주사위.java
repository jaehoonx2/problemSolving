import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int seq = 1;
        while(n-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case " + seq + ": " + (a+b));
            seq++;
        }
    }
}