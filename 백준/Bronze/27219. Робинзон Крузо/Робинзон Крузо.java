import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String v = "V".repeat(n/5);
        String i = "I".repeat(n%5);

        System.out.println(v+i);
    }
}