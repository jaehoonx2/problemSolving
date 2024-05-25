import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
    
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', arr[0]);
        map.put('B', arr[1]);
        map.put('C', arr[2]);

        String str = sc.next();
        for(char ch : str.toCharArray())
            System.out.print(map.get(ch) + " ");
    }
}