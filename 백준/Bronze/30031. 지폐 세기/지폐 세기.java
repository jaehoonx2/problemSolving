import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] size = new int[n][2];
        int amount = 0;
        
        for(int i = 0; i < n; i++){
            size[i][0] = sc.nextInt();
            size[i][1] = sc.nextInt();

            if(size[i][0] == 136)
                amount += 1000;
            else if(size[i][0] == 142)
                amount += 5000;
            else if(size[i][0] == 148)
                amount += 10000;
            else
                amount += 50000;
        }

        System.out.println(amount);
    }
}