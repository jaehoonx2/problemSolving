import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = new BigDecimal(sc.next());
        MathContext mc = new MathContext(10);
        System.out.println(a.sqrt(mc).multiply(new BigDecimal("4")));
    }
}