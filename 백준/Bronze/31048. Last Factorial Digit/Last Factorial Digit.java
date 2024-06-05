import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(sc.hasNext()){
            int num = sc.nextInt();
            int result = factorial(num);
            String str = Integer.toString(result);
            System.out.println(str.substring(str.length() - 1));
        } 
    }

    public static int factorial(int n){
        return n > 1 ? n * factorial(n - 1) : 1;
    }
}