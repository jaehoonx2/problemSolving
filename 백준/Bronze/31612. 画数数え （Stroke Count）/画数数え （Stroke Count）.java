import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        int sum = 0;
        for(char ch : str.toCharArray())
            sum += ch == 'o' ? 1 : 2;

        System.out.println(sum);        
    }
}