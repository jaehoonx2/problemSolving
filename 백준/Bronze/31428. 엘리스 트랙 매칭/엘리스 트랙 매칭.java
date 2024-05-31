import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] friends = new String[n];

        for(int i = 0; i < friends.length; i++)
            friends[i] = sc.next();

        String helloBit = sc.next();

        int sum = 0;
        for(String str : friends)
            sum += str.equals(helloBit) ? 1 : 0;

        System.out.println(sum);        
    }
}