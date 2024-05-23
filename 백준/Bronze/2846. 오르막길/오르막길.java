import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        
        int startIdx = 0;
        int maxDegree = 0;
        
        for(int i = 1; i < arr.length; i++) {
            // 오르막길 끊김
            if(arr[i-1] >= arr[i]){
                maxDegree = arr[i-1] - arr[startIdx] > maxDegree ? arr[i-1] - arr[startIdx] : maxDegree;
                startIdx = i;
            }

            // 마지막항까지 오르막길이라면
            if(i == arr.length - 1 && arr[i-1] < arr[i])
                maxDegree = arr[i] - arr[startIdx] > maxDegree ? arr[i] - arr[startIdx] : maxDegree;
        }

        System.out.println(maxDegree);
    }
}