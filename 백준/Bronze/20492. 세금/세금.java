import java.util.*;
import java.lang.*;
import java.io.*;
 
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double a = n * 0.78;
		double b = n * 0.956;
		System.out.println((int) a + " " + (int) b);
	}
}