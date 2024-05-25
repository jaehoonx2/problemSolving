import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int index = 1;
        while(sc.hasNext()){
            String str = sc.nextLine();
            System.out. println(index + ". " + str);
            index++;
        }
    }
}