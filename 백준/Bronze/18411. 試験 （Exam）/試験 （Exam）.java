import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[3];
        int i = 0;
        
        while(sc.hasNext())
            score[i++] = sc.nextInt();

        Arrays.sort(score);

        System.out.println(score[1] + score[2]);
    }

}