import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] ops = str.split(" ");

        System.out.println(
            Integer.parseInt(ops[0]) + Integer.parseInt(ops[2]) == Integer.parseInt(ops[4]) ?
            "YES" :
            "NO"
        );
    }
}