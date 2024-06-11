import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rank = new int[5];
        
        int cnt = 0;
        for(int i = 0; i < rank.length; i++){
            rank[i] = sc.nextInt();
            cnt += (i > 0 && rank[0] - rank[i] <= 1000) ? 1 : 0;
        }
        
        System.out.println(cnt);
    }
}