import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[3];
        
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextLong();

        System.out.println(arr[0] + arr[1] <= arr[2] ? 1 : 0);
    }
}