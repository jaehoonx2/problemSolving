import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while(sc.hasNext()){
            int num = sc.nextInt();
            int temp = num < 0 ? -1 * num : num;
            if(temp % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");                
        }
    }
}