import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = 1;
        while(n-- > 0){
            int[] arr = new int[5];
            for(int i = 0; i < arr.length; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            System.out.println("Case #" + idx++ + ": " + arr[4]);
        }
    }
}