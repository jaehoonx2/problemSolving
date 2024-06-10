import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(sc.hasNext()){
            int w = sc.nextInt();
            int k = sc.nextInt();

            System.out.println(w*k / 2);
        }
    }
}