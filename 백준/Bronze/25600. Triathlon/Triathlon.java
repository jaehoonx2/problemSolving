import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();

            int score = arr[i][0] == arr[i][1] + arr[i][2] ? arr[i][0] * (arr[i][1] + arr[i][2]) * 2 : arr[i][0] * (arr[i][1] + arr[i][2]);
            max =  score > max ? score : max;
        }

        System.out.println(max);
    }
}