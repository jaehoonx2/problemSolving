import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
        String answer = number.startsWith("555") ? "YES" : "NO";
        System.out.println(answer);
	}
}