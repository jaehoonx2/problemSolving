import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        set.add('C');
        set.add('A');
        set.add('M');
        set.add('B');
        set.add('R');
        set.add('I');
        set.add('D');
        set.add('G');
        set.add('E');
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String newStr = new String();
        for(int i = 0; i < str.length(); i++){
            if(!set.contains(str.charAt(i)))
                newStr += str.charAt(i);
        }

        System.out.println(newStr);
    }
}