import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(str.charAt(str.length() - 1) =='.' ? str : str + '.');
        }
    }
}