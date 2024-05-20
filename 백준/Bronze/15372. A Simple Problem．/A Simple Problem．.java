import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		long T = sc.nextLong();
		
		for(int i = 0; i < T; i++){
			long N = sc.nextLong();	
			System.out.println((N*N));
		}
	}
}