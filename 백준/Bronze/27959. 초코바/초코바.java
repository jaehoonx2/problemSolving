import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n*100 - m >= 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}