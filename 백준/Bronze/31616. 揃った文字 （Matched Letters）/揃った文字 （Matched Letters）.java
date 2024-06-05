import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        for(int i = 1; i < n ; i++){
            if(str.charAt(i) != str.charAt(i-1)){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}