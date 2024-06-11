import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int yards = a*b;
        double acres = (double) yards / 4840;
        System.out.println(acres % 5.0 > 0 ? (int) Math.ceil(acres / 5.0) : (int) Math.floor(acres / 5.0));
    }
}