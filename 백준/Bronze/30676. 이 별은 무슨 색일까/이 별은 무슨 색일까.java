import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String color = "";
        
        if(n < 425)
            color = "Violet";
        else if(n < 450)
            color = "Indigo";
        else if(n < 495)
            color = "Blue";
        else if(n < 570)
            color = "Green";
        else if(n < 590)
            color = "Yellow";
        else if(n < 620)
            color = "Orange";
        else
            color = "Red";

        System.out.println(color);
    }
}