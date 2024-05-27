import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        int[] weight = new int[3];
        
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < weight.length; i++)
            weight[i] = sc.nextInt();

        Arrays.sort(weight);

        System.out.println(weight[1]);
    }
}