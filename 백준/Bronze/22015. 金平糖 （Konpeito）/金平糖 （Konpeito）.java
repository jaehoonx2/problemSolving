import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] candies = new int[3];
        int sum = 0;
        
        for(int i = 0; i < candies.length; i++){
            candies[i] = sc.nextInt();
            sum += candies[i];
        }
        
        Arrays.sort(candies);

        System.out.println(candies[2]*3 - sum);
    }
}