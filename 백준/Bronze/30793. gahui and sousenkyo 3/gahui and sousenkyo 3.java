import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        double v = (double) p / r;

        System.out.println(v < 0.2 ? "weak"
                                   : v < 0.4 ? "normal"
                                             : v < 0.6 ? "strong" : "very strong");
    }
}