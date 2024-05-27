import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 5 > 0)
            System.out.println((num / 5) + 1);
        else
            System.out.println((num / 5));
    }
}