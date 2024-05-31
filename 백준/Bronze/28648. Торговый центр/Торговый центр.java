import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 200;
        while(sc.hasNext()){
            int i = sc.nextInt();
            int t = sc.nextInt();
            min = i+t < min ? i+t : min;
        }
        
        System.out.println(min);
    }
}