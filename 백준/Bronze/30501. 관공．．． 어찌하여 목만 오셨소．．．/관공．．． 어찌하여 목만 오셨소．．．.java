import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(sc.hasNext()){
            String str = sc.next();
            if(str.indexOf("S") != -1){
                System.out.println(str);
                break;
            }
        }
    }
}