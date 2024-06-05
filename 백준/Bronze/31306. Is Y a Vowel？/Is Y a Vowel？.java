import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        int vowelCnt = 0;
        int yCnt = 0;

        for(char ch : str.toCharArray())
            if(set.contains(ch))
                vowelCnt++;
            else if(ch == 'y')
                yCnt++;
        
        System.out.println(vowelCnt + " " + (vowelCnt + yCnt));
    }
}