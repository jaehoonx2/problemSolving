import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        String str = "*".repeat(c);

        for(int i = 0; i < r; i++)
            System.out.println(str);
    }
}