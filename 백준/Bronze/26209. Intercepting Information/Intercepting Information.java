import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();

            if(num == 9){
                System.out.println("F");
                return;
            }
        }
        System.out.println("S");
    }
}