import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int over = sc.nextInt();
        
        int n = sc.nextInt();
        int[] consume = new int[n];
        
        for(int i = 0; i < consume.length; i++){
            consume[i] = sc.nextInt();
            int charge = 0;
            if(consume[i] > 1000)
                charge = (1000 * base) + ((consume[i] - 1000) * over);
            else
                charge = consume[i] * base;

            System.out.println(consume[i] + " " + charge);
        }
    }
}