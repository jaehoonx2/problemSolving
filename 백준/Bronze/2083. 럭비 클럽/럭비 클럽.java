import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] arr = str.split(" ");

            if(arr[0].equals("#") && Integer.parseInt(arr[1]) == 0 && Integer.parseInt(arr[2]) == 0)
                break;
            
            if(Integer.parseInt(arr[1]) > 17 || Integer.parseInt(arr[2]) >= 80)
                System.out.println(arr[0] + " " + "Senior");
            else
                System.out.println(arr[0] + " " + "Junior");
        }
    }
}