import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c4 = sc.nextInt();
        double c4Wieght = c4 * 0.229 * 0.324;
        int a3 = sc.nextInt();
        double c3Wieght = a3 * 0.297 * 0.420;
        int a4 = sc.nextInt();
        double a4Wieght = a4 * 0.210 * 0.297;

        System.out.println(2*c4Wieght + 2*c3Wieght + 1*a4Wieght);   
    }
}