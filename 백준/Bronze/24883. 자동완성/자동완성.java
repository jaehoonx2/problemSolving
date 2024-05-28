import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String answer = Character.toUpperCase(str.charAt(0)) == 'N' ?
                        "Naver D2" :
                        "Naver Whale";

        System.out.println(answer);
    }
}