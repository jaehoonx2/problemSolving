import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sc.hasNext())
            sum += sc.nextInt();
        System.out.println((sum / 60));
        System.out.println((sum % 60));
    }
}