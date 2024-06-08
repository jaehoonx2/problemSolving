import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal percent = new BigDecimal(sc.next());
        BigDecimal a = new BigDecimal("100").divide(percent, 10, BigDecimal.ROUND_HALF_UP);
        BigDecimal b = new BigDecimal("100").divide(new BigDecimal(100).subtract(percent), 10, BigDecimal.ROUND_HALF_UP);
        System.out.println(a);
        System.out.println(b);
    }
}