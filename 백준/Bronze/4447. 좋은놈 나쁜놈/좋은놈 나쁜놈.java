import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        while(sc.hasNext()){
            String str = sc.nextLine();
            int bCnt = 0;
            int gCnt = 0;

            for(char ch : str.toCharArray()){
                if(ch == 'b' || ch == 'B')
                    bCnt++;
                else if(ch == 'g' || ch == 'G')
                    gCnt++;
            }

            if(bCnt < gCnt)
                System.out.println(str + " is GOOD");
            else if(bCnt > gCnt)
                System.out.println(str + " is A BADDY");
            else
                System.out.println(str + " is NEUTRAL");            
        }
    }
}