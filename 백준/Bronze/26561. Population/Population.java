import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(sc.hasNext()){
            int pop = sc.nextInt();
            int sec = sc.nextInt();

            pop += (int) (sec / 4);
            pop -= (int) (sec / 7);

            System.out.println(pop);
        }
    }
}