import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int order = 1;
        boolean isFounded = false;
        
        while(sc.hasNext()){
            String nm = sc.nextLine();

            if(nm.indexOf("FBI") != -1){
                System.out.print(order + " ");
                isFounded = true;
            }

            order++;
        }

        if(!isFounded)
        System.out.println("HE GOT AWAY!");
    }
}