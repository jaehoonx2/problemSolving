import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String str = sc.next();
            int start = sc.nextInt();
            int end = sc.nextInt();

            System.out.println(str.substring(0, start) + str.substring(end));
        }
    }
}