import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = new BigDecimal(sc.next());
        MathContext mc = new MathContext(10);
        BigDecimal r = a.divide(new BigDecimal(Double.toString(Math.PI)), 9, RoundingMode.HALF_DOWN).sqrt(mc);
        System.out.println(r.multiply(new BigDecimal("2").multiply(new BigDecimal(Double.toString(Math.PI)))));
    }
}