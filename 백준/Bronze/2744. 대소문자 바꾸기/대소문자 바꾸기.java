import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0; i < str.length(); i++){
            str = Character.isLowerCase(str.charAt(i)) ?
                  str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1) :
                  str.substring(0, i) + Character.toLowerCase(str.charAt(i)) + str.substring(i + 1);
        }

        System.out.println(str);
    }
}