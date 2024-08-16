import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(sc.hasNext()){
            double area = sc.nextDouble();
            double base = sc.nextDouble();
            double height = area * 2 / base;

            System.out.printf("The height of the triangle is %.2f units\n", height);
        }
    }
}