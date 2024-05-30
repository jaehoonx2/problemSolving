import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();

        if(h1 >= 20 && h1 <= 23)
            System.out.println((24 - h1) + h2);
        else
            System.out.println(h2 - h1);
    }
}