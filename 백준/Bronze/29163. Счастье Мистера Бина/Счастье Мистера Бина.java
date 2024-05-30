import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int oddCnt = 0;
        int evenCnt = 0;

        while(sc.hasNext()){
            int num = sc.nextInt();

            if(num % 2 == 0)
                evenCnt++;
        }
            
        System.out.println(evenCnt > n / 2 ? "Happy" : "Sad");
    }
}