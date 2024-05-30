import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> solved = new HashMap<>();
        solved.put(1 , 12);
        solved.put(2 , 11);
        solved.put(3 , 11);
        solved.put(4 , 10);
        solved.put(5 , 9);
        solved.put(6 , 9);
        solved.put(7 , 9);
        solved.put(8 , 8);
        solved.put(9 , 7);
        solved.put(10, 6);
        solved.put(11, 6);

        Map<Integer, Integer> panalties = new HashMap<>();
        panalties.put(1 , 1600);
        panalties.put(2 , 894);
        panalties.put(3 , 1327);
        panalties.put(4 , 1311);
        panalties.put(5 , 1004);
        panalties.put(6 , 1178);
        panalties.put(7 , 1357);
        panalties.put(8 , 837);
        panalties.put(9 , 1055);
        panalties.put(10, 556);
        panalties.put(11, 773);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(solved.get(n) + " " + panalties.get(n));
    }
}