import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lv = sc.nextInt();
        String judge = sc.next();
        int result = 0;
        
        if(judge.equals("miss"))
            result = 0;
        else if(judge.equals("bad"))
            result = lv*200;
        else if(judge.equals("cool"))
            result = lv*400;
        else if(judge.equals("great"))
            result = lv*600;
        else
            result = 1 * lv * 1000;

        System.out.println(result);
    }
}