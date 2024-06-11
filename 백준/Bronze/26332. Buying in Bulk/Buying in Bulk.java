import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int c = sc.nextInt();
            int p = sc.nextInt();
            
            System.out.println(c + " " + p);
            if(c == 1)
                System.out.println(c*p);
            else
                System.out.println(c*p - 2*(c-1));
        }
    }
}