import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String answer = "";

        for(int i = 0; i < a.length(); i++)
            answer += Character.getNumericValue(a.charAt(i)) > Character.getNumericValue(b.charAt(i)) ?
                      a.charAt(i) : b.charAt(i); 

        System.out.println(answer);
    }

}