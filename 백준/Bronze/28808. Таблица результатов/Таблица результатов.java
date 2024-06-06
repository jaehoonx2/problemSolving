import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        while(sc.hasNext())
            cnt += sc.next().indexOf("+") != -1 ? 1 : 0;
        System.out.println(cnt);
    }
}