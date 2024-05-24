import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0;
        for(char ch : str.toCharArray())
            cnt += set.contains(ch) ? 1 : 0;
        System.out.println(cnt);
    }
}