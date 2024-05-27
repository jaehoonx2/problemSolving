import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jaehwan = sc.next();
        String doctor = sc.next();

        if(jaehwan.indexOf(doctor) != -1)
            System.out.println("go");
        else
            System.out.println("no");
    }
}