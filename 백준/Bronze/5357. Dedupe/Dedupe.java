import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Character, Integer> map = new HashMap<>();
        while(n-- > 0){
            String str = sc.next();
            char[] arr = str.toCharArray();
            String answer = "";
            answer += arr[0];
            
            for(int i = 1; i < arr.length; i++)
                if(answer.charAt(answer.length() - 1) != arr[i])
                    answer += arr[i];

            System.out.println(answer);
        }
    }
}