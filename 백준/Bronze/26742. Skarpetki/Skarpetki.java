import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int b = 0;
        int c = 0;
        
        for(char ch : str.toCharArray())
            if(ch == 'B')
                b++;
            else
                c++;
         
        System.out.println((b / 2) + (c / 2));
    }
}