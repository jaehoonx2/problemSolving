import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "WelcomeToSMUPC";
        System.out.println(str.charAt(n <= str.length() ? n - 1 : (n - 1) % str.length()));
    }
}