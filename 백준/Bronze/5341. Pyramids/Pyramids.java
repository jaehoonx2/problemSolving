import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int num = sc.nextInt();

            if(num == 0)
                break;

            System.out.println(num * (num + 1) / 2);
        }
    }
}