import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal d1 = new BigDecimal(sc.next());
        BigDecimal d2 = new BigDecimal(sc.next());
        System.out.println(d1.add(d1).add(d2.multiply(new BigDecimal("2")).multiply(new BigDecimal("3.141592"))));
    }
}