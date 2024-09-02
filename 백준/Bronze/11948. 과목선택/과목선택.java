import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sci = new int[4];
        int[] soc = new int[2];

        for(int i = 0; i < sci.length; i++)
            sci[i] = sc.nextInt();

        for(int j = 0; j < soc.length; j++)
            soc[j] = sc.nextInt();

        Arrays.sort(sci);
        Arrays.sort(soc);

        System.out.println(sci[1]+sci[2]+sci[3]+soc[1]);
    }
}