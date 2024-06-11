import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int red = 0;
        int blue = 0;

        int[][] matrix = new int[r][c];
        for(int i = 0; i < matrix.length; i++){
            String str = sc.next();
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = Character.getNumericValue(str.charAt(j));
                if(matrix[i][j] == 0)
                    red++;
                else
                    blue++;
            }
        }

        System.out.println(red < blue ? red : blue);
    }
}