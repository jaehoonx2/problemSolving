import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long min = a > b ? b : a;
		long max = a > b ? a : b;
		
		long tmp1 = min * (min - 1) / 2;
		long tmp2 = max * (max + 1) / 2;
			
		System.out.println(tmp2 - tmp1);
	}
}