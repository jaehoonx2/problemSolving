import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[4];
        
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextLong();

        Arrays.sort(arr);

        System.out.println(arr[3] + arr[2] + arr[1] + 1);
    }
}