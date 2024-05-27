import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = 1;

        while(sc.hasNext()){
            String str = sc.nextLine();

            if(str.equals("0"))
                break;
            else
                System.out.println("Case " + idx + ": Sorting... done!");

            idx++;
        }
    }
}