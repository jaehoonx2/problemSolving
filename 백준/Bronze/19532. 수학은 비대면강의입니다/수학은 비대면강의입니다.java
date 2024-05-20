import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
 
		int x = (f*b - c*e) / (b*d - a*e);
		int y = (a*f - d*c) / (a*e - b*d);
 
 
		System.out.println(x + " " + y);
	}
}