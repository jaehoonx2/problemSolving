import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Never gonna give you up");
        set.add("Never gonna let you down");
        set.add("Never gonna run around and desert you");
        set.add("Never gonna make you cry");
        set.add("Never gonna say goodbye");
        set.add("Never gonna tell a lie and hurt you");
        set.add("Never gonna stop");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(sc.hasNext()){
            String str = sc.nextLine();
            if(!set.contains(str)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}