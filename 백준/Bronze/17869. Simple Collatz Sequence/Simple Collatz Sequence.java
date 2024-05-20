import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		int cnt = 0;
		
		while(n != 1){
			n = (n % 2 == 0) ? n / 2 : n + 1;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}