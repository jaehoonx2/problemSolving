import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int num = sc.nextInt();

            if(num == 0)
                break;

            int[] newbie = new int[num];
            int[] student = new int[num];

            for(int i = 0; i < num; i++){
                newbie[i] = sc.nextInt();
                
                if(i == 0)
                    student[i] = newbie[i];
                else if(i == 1 || i == 2)
                    student[i] = newbie[i] + student[i-1];
                else
                    student[i] = newbie[i] + student[i-1] - newbie[i-3]; 
            }

            Arrays.sort(student);

            System.out.println(student[num-1]);
        }
    }
}