import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(sc.hasNext()){
            
            BigDecimal a = new BigDecimal(sc.next());
            
            String str2 = sc.next();
            if(str2.charAt(0) == '.')
                str2 = "0" + str2;            
            BigDecimal b = new BigDecimal(str2);
            
            String str3 = sc.next();
            if(str3.charAt(0) == '.')
                str3 = "0" + str3;            
            BigDecimal c = new BigDecimal(str3);

            System.out.printf("$%.2f\n", Double.parseDouble(a.multiply(b).multiply(c).toString()));
        }
    }
}