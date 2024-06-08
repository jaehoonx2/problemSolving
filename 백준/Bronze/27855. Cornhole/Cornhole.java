import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];
        int[] b = new int[2];
        
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        b[0] = sc.nextInt();
        b[1] = sc.nextInt();   
        
        int aScore = (a[0]*3 + a[1]*1);
        int bScore = (b[0]*3 + b[1]*1);
        int diff = aScore - bScore < 0 ? -1 * (aScore - bScore) : aScore - bScore;
        
        System.out.println(aScore > bScore ? "1" + " " + diff : aScore < bScore ? "2" + " " + diff : "NO SCORE");
    }
}