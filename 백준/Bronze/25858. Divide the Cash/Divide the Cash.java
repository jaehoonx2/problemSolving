import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dollar = sc.nextInt();        
        int[] student = new int[n];

        int qNum = 0;
        for(int i = 0; i < student.length; i++){
            student[i] = sc.nextInt();
            qNum += student[i];
        }

        int dPerQ = dollar / qNum;

        for(int j = 0; j < student.length; j++)
            System.out.println(dPerQ * student[j]);
    }
}