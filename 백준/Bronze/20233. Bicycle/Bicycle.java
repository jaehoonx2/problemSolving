import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();
        int b = sc.nextInt();
        int y = sc.nextInt();
        int t = sc.nextInt();

        int opt1Amt = t - 30 <= 0 ? a : (t - 30)*x*21 + a;
        int opt2Amt = t - 45 <= 0 ? b : (t - 45)*y*21 + b;        

        System.out.println(opt1Amt + " " + opt2Amt);
    }
}