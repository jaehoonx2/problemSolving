import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i % arr.length] == arr[(i+1) % arr.length] + arr[(i+2) % arr.length]){
                System.out.println(1);
                return;
            } else if(arr[i % arr.length] == arr[(i+1) % arr.length] * arr[(i+2) % arr.length]){
                System.out.println(2);
                return;                
            }    
        }
        System.out.println(3);
    }
}