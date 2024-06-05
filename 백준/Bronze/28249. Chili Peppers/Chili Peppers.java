import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        map.put("Poblano", 1500);
        map.put("Mirasol", 6000);
        map.put("Serrano", 15500);
        map.put("Cayenne", 40000);
        map.put("Thai", 75000);
        map.put("Habanero", 125000);
        
        int n = sc.nextInt();
        int sum = 0;
        while(sc.hasNext())
            sum += map.get(sc.next());
        System.out.println(sum);            
    }
}