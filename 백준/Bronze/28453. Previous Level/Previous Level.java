import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(sc.hasNext()){
            int lev = sc.nextInt();
            System.out.print((lev < 250 ? 4 : lev < 275 ? 3 : lev < 300 ? 2 : 1) + " ");
        }       
    }

}