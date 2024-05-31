import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int answer = 0;
        
        if(a+b==c)
            answer = 1;
        else if(b+c==a)
            answer = 1;
        else if(a+c==b)
            answer = 1;

        System.out.println(answer);
    }
}