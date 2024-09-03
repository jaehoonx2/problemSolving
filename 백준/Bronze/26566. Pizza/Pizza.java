import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0){
            double a1 = sc.nextDouble();
            double p1 = sc.nextDouble();
            double r1 = sc.nextDouble();
            double p2 = sc.nextDouble();

            System.out.println((a1 / p1) > (Math.PI * Math.pow(r1, 2) / p2) ? "Slice of pizza" : "Whole pizza");
        }
    }
}