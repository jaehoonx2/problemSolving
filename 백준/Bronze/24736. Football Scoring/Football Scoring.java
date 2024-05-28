import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] away = new int[5];
        int[] home = new int[5];

        for(int i = 0; i < away.length; i++)
            away[i] = sc.nextInt();

        for(int i = 0; i < home.length; i++)
            home[i] = sc.nextInt();

        System.out.println(getTotalScore(away) + " " + getTotalScore(home));
    }

    public static int getTotalScore(int[] arr){
        return arr[0]*6 + arr[1]*3 + arr[2]*2 + arr[3]*1 + arr[4]*2;
    }
}