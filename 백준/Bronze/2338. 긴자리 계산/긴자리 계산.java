import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        BigInteger bia = new BigInteger(a);
        BigInteger bib = new BigInteger(b);

        System.out.println(bia.add(bib));
        System.out.println(bia.subtract(bib));
        System.out.println(bia.multiply(bib));
    }
}