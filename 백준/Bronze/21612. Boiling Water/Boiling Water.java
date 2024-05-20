import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();	
		int p = 5 * b - 400;
		int level = p < 100 ? 1 : p > 100 ? -1 : 0;
		
		System.out.println(p);
		System.out.println(level);
	}		
}