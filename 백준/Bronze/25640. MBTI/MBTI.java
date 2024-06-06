import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int cnt = 0;
        while(sc.hasNext())
            cnt += str.equals(sc.next()) ? 1 : 0;
        System.out.println(cnt);
    }
}