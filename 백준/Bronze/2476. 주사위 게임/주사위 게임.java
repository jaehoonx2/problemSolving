import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] money = new int[n];
        
        int k = 0;
        while(sc.hasNext()){
            int[] arr = new int[3];

            for(int i = 0; i < arr.length; i++)
                arr[i] = sc.nextInt();

            if(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[0]) {
                money[k] = 10000 + arr[0] * 1000;
            } else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]) {
                if(arr[0] == arr[1] || arr[1] == arr[2])
                    money[k] = 1000 + arr[1] * 100;
                else
                    money[k] = 1000 + arr[2] * 100;
            } else {
                Arrays.sort(arr);

                money[k] = arr[2] * 100;
            }
            k++;
        }

        Arrays.sort(money);

        System.out.println(money[money.length-1]);
    }
}