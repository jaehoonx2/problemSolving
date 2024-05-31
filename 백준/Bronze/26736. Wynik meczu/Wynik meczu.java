import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ab = sc.next();

        int a = 0;

        for(char ch : ab.toCharArray())
            a += ch == 'A' ? 1 : 0;

        System.out.println(a + " : " +(ab.length() - a));
    }
}