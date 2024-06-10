import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StringBuilder sb = new StringBuilder("SciComLove");

        if(n % 2 == 0)
            System.out.println(sb.toString());
        else
            System.out.println(sb.reverse().toString());
    }
}