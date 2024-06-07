import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(x % 2 == 0)
                x = ((int) x / 2) ^ 6;
            else
                x = (2*x) ^ 6;
        }

        System.out.println(x);
    }
}