import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		
		long boxCnt = n*m != 1 ?  (n*m % 2 == 0 ? n*m : n*m - 1) : 1;
		
		System.out.println(boxCnt / 2);
	}
}