import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("SONGDO", "HIGHSCHOOL");
        map.put("CODE", "MASTER");
        map.put("2023", "0611");
        map.put("ALGORITHM", "CONTEST");
        
        Scanner sc = new Scanner(System.in);
        System.out.println(map.get(sc.next()));
    }
}