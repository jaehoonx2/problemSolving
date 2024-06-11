import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int depth = 0;
        
        while(sc.hasNext()){
            String stair = sc.next();
            int step = sc.nextInt();

            depth += stair.equals("Es") ? 21 * step : 17 * step;
        }

        System.out.println(depth);
    }
}