import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(str.charAt(0) == str.charAt(1))
            System.out.println(1);
        else
            System.out.println(0);
    }
}