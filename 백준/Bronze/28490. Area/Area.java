import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();

            max = max < a*b ? a*b : max;
        }

        System.out.println(max);
    }
}