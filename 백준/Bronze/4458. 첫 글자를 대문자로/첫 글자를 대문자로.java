import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            char[] answer = str.toCharArray();
            answer[0] = Character.toUpperCase(answer[0]);
            System.out.println(new String(answer));
        }
    }
}