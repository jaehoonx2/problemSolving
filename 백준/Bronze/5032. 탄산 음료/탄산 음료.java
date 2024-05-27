import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int haveBottle = sc.nextInt() + sc.nextInt();
        int needBottle = sc.nextInt();
        int drink = 0;

        while(haveBottle >= needBottle){
            int tmp = haveBottle / needBottle;

            drink += tmp;

            haveBottle = haveBottle - (needBottle * tmp) + tmp;
        }

        System.out.println(drink);
    }
}