import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int location = 0;

        while(sc.hasNext())
            location += sc.nextInt();
        
        System.out.println(location < 0 ? "Left" : location > 0 ? "Right" : "Stay");
    }
}