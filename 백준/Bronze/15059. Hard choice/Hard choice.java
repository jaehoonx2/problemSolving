import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] menu = new int[3];
        int[] cusMenu = new int[3];
        
        for(int i = 0; i < menu.length; i++)
            menu[i] = sc.nextInt();

        for(int j = 0; j < cusMenu.length; j++)
            cusMenu[j] = sc.nextInt();

        int notWanted = 0; 
        for(int k = 0; k < cusMenu.length; k++)
            notWanted += menu[k] - cusMenu[k] < 0 ? -1 *  (menu[k] - cusMenu[k]) : 0; 
        
        System.out.println(notWanted);
    }
}