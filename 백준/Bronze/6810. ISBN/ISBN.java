import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		a = a * 1;
		int b = sc.nextInt();
		b = b * 3;
		int c = sc.nextInt();
		c = c * 1;
		
		int sum = 9 * 1 + 7 * 3 + 8 * 1 + 0 * 3 + 9 * 1 + 2 * 3 + 1 * 1 + 4 * 3 + 1 * 1 + 8 * 3 + a + b + c;
		System.out.println("The 1-3-sum is " + sum);
	}
}