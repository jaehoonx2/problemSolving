import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] arr = new int[n][3];

        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();

        for(int k = 0; k < arr.length; k++)
            System.out.println((arr[k][0] * (arr[k][2] - 1) + arr[k][1]));        
    }
}