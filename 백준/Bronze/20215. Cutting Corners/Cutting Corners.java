import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        double l = Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
        System.out.println((double) w + h - l);
    }
}