import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int colon = 0;
        int underBar = 0;
        int lowerCase = 0;
        
        for(int i = 0; i < str.length(); i++){
            switch(str.charAt(i)){
                case ':' :
                    colon++;
                    break;
                case '_' :
                    underBar++;
                    break;
                default :
                    lowerCase++;
                    break;
            }
        }

        System.out.println((str.length() + colon + underBar * 5));
    }
}