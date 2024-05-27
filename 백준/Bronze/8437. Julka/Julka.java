import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger num = new BigInteger(sc.next());
        BigInteger dif = new BigInteger(sc.next());
        
        System.out.println(num.add(dif).divide(new BigInteger("2")));
        System.out.println(num.subtract(dif).divide(new BigInteger("2")));
    }
}