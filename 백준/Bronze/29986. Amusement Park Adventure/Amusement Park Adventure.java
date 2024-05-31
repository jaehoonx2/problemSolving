import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height = sc.nextInt();

        int[] rides = new int[n];
        for(int i = 0; i < rides.length; i++)
            rides[i] = sc.nextInt();

        int sum = 0;
        for(int h : rides)
            sum += height >= h ? 1 : 0;

        System.out.println(sum);        
    }
}