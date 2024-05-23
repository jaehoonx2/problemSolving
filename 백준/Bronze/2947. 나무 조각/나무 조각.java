import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] woods = new int[5];
        
        for(int i = 0; i < 5; i++)
            woods[i] = sc.nextInt();

        int[] answer = {1, 2, 3, 4, 5};

        int idx = 0;
        
        while(!Arrays.equals(woods, answer)){
            lotateWoods(woods, idx % 4);
            idx++;
        }        
    }

    public static void lotateWoods(int[] woods, int i){
        if(woods[i] > woods[i+1]){
            int tmp = woods[i];
            woods[i] = woods[i+1];
            woods[i+1] = tmp;

            for(int j = 0; j < woods.length; j++){
                System.out.print(woods[j] + " ");
                if(j == woods.length - 1)
                    System.out.println();
            }
        }
    }
}