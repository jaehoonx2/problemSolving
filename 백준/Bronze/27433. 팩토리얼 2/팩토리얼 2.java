import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long answer = factorial(n);
		System.out.println(answer);
	}
	
	public static long factorial(long num) {
		return num > 1 ? num * factorial(num - 1) : 1;
	}
}