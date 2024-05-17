import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		int result = n != m ? 0 : 1;
		System.out.println(result);
	}
}