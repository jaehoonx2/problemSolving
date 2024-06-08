import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int bullet = 0;
        int save = 0;
        while(sc.hasNext()){
            String action = sc.next();
            
            switch(action){
                case "save" : save = bullet; break;
                case "load" : bullet = save; break;
                case "shoot" : bullet--; break;
                case "ammo" : bullet += k; break;
            }

            System.out.println(bullet);
        }
    }
}