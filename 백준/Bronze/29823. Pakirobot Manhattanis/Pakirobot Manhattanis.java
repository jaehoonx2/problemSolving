import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        int n = 0;
        int e = 0;
        int s = 0;
        int w = 0;
        for(char ch : str.toCharArray())
            switch(ch){
                case 'N' : n++; break;
                case 'E' : e++; break;
                case 'S' : s++; break;
                case 'W' : w++; break;
            }
    
        int lr = w > e ? w - e : e - w;
        int ud = n > s ? n - s : s - n;

        System.out.println(lr + ud);
    }
}