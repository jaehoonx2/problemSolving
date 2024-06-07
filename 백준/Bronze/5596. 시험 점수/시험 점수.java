import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mingook = new int[4];
        int sumMingook = 0;
        int[] manse = new int[4];
        int sumManse = 0;
        
        for(int i = 0; i < mingook.length; i++){
            mingook[i] = sc.nextInt();
            sumMingook += mingook[i];
        }
        
        for(int i = 0; i < manse.length; i++){
            manse[i] = sc.nextInt();  
            sumManse += manse[i];
        }

        System.out.println(sumManse > sumMingook ? sumManse : sumMingook);
    }
}