import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('k', 0); map.put('K', 0);
        map.put('p', 1); map.put('P', 1);
        map.put('n', 3); map.put('N', 3);
        map.put('b', 3); map.put('B', 3);
        map.put('r', 5); map.put('R', 5);
        map.put('q', 9); map.put('Q', 9);
        
        int black = 0;
        int white = 0;
        
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            
            for(char ch : str.toCharArray())
                if(ch != '.')
                    if(Character.isLowerCase(ch))
                        black += map.get(ch);
                    else
                        white += map.get(ch); 
        }

        System.out.println(white - black);
    }
}