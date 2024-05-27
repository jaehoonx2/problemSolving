import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int smile = 0;
        int sad = 0;
        
        while(str.indexOf(":-)") != -1){
            int idx = str.indexOf(":-)");
            str = str.substring(0, idx) + str.substring(idx + 3);
            smile++;
        }
 
        while(str.indexOf(":-(") != -1){
            int idx = str.indexOf(":-(");
            str = str.substring(0, idx) + str.substring(idx + 3);
            sad++;
        }

        if(smile > sad)
            System.out.println("happy");
        else if(smile < sad)
            System.out.println("sad");
        else if(smile == 0 && sad == 0)
            System.out.println("none");
        else
            System.out.println("unsure");
    }
}