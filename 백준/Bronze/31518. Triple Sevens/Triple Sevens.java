import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(sc.hasNext()){
            boolean isSeven = false;
            for(int i = 0; i < num; i++)
                isSeven = sc.nextInt() == 7 ? true : isSeven;

            if(!isSeven){
                System.out.println(0);
                return;
            }
        }

        System.out.println(777);
    }
}