import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            long n = sc.nextLong();
            long s = sc.nextLong();

            n += 1;    // 위원장도 추가

            System.out.println(s / n);
        }
    }
}