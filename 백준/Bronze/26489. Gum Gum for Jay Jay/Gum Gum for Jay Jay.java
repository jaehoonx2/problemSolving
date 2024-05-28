import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while(sc.hasNext()){
            String str = sc.nextLine();
            cnt++;
        }
        System.out.println(cnt);
    }
}