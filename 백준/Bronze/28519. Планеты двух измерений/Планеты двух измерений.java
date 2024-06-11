import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        long n = sc.nextLong();
        long m = sc.nextLong();

        System.out.println(n < m ? n*2 + 1 : m < n ? m*2 + 1 : n*2);
    }
}