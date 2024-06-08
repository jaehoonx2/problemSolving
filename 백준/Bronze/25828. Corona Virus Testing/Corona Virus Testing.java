import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt(); // 그룹수
        int p = sc.nextInt(); // 그룹당 사람수
        int t = sc.nextInt(); // 양성 판정 받은 그룹수

        int tc1 = g*p;
        int tc2 = g + t*p;

        System.out.println(tc1 < tc2 ? 1 : tc1 > tc2 ? 2 : 0);
    }
}