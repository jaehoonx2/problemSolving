import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SortedSet<Integer> set = new TreeSet<>();
        
        for(int i = 0; i < n; i++)
            set.add(sc.nextInt());

        for(int num : set)
            System.out.println(num);
    }
}