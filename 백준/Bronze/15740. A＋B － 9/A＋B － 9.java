import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
 
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		
		System.out.println(a.add(b));
	}
}