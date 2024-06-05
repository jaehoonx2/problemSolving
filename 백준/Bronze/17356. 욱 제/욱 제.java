import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = new BigDecimal(sc.nextInt());
        BigDecimal b = new BigDecimal(sc.nextInt());
        BigDecimal m = b.subtract(a).divide(new BigDecimal("400"));

        double percent = (double) 1 / (1 + Math.pow(10, m.doubleValue()));

        System.out.println(percent);
    }
}