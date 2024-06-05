import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abc = new int[3];
        for(int i = 0; i < abc.length; i++)
            abc[i] = sc.nextInt();

        String answer = new String();
        for(int i = 0; i < abc.length; i++) {
            if(i == 0 && abc[i] != abc[i+1] && abc[i+1] == abc[i+2]){
                answer = "A";
                break;
            }
            else if(i == 1 && abc[i] != abc[i-1] && abc[i-1] == abc[i+1]){
                answer = "B";
                break;
            }    
            else if(i == 2 && abc[i] != abc[i-1] && abc[i-1] == abc[i-2])
                answer = "C";
            else
                answer = "*";
        }

        System.out.println(answer);
    }
}