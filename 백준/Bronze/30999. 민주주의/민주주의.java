import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int qCnt = 0;
        
        while(n-- > 0){
            String str = sc.next();
            int oCnt = 0;
            for(char ch : str.toCharArray()){
                if(ch == 'O')
                    oCnt++;
            }
            if((double) oCnt > (double) str.length() / 2)
                qCnt++;
        }

        System.out.println(qCnt);
    }
}