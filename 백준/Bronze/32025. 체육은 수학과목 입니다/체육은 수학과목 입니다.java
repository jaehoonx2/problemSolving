import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt() * 100;
        int w = sc.nextInt() * 100;

        System.out.println(h < w ? h / 2 : w / 2);
    }
}