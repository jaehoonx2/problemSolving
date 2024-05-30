import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            BigInteger num = new BigInteger(sc.next());

            if(num.equals(BigInteger.ZERO))
                break;
            else
                System.out.println(num.remainder(new BigInteger("42")) == BigInteger.ZERO ? "PREMIADO" : "TENTE NOVAMENTE");
        }
    }
}