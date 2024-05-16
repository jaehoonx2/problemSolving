import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		int youngest = sc.nextInt();
		int middle = sc.nextInt();
		int oldest = 2 * middle - youngest;
		
		System.out.println(oldest);
	}
}