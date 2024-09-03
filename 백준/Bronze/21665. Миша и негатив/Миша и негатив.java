import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] pic = new char[n][m];
        char[][] rev = new char[n][m];

        for(int i = 0; i < n; i++){
            String str = sc.next();
            for(int j = 0; j < m; j++)
                pic[i][j] = str.charAt(j);
        }

        for(int i = 0; i < n; i++){
            String str = sc.next();
            for(int j = 0; j < m; j++)
                rev[i][j] = str.charAt(j);
        }

        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                cnt += pic[i][j] == rev[i][j] ? 1 : 0;
        }

        System.out.println(cnt);
    }
}