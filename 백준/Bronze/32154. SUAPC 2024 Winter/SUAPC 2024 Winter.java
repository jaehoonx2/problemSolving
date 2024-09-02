import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        String[][] board = {{"11", "A B C D E F G H J L M"},
                            {"9", "A C E F G H I L M"},
                            {"9", "A C E F G H I L M"},
                            {"9", "A B C E F G H L M"},
                            {"8", "A C E F G H L M"},
                            {"8", "A C E F G H L M"},
                            {"8", "A C E F G H L M"},
                            {"8", "A C E F G H L M"},
                            {"8", "A C E F G H L M"},
                            {"8", "A B C F G H L M"}};

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(board[n-1][0]);
            System.out.println(board[n-1][1]);            
        }
    }
}