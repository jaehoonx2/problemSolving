import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int hours = 0;
        
        for(int i = 0; i < n; i++){
            hours += sc.nextInt();
            if(i != n - 1)
                hours += 8;
        }

        System.out.println(hours / 24 + " " + hours % 24);
    }
}