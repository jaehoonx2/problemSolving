import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String seminar = sc.next();
            int num = sc.nextInt();
            map.put(num, seminar);
        }

        System.out.println(map.get(map.lastKey()));
    }
}