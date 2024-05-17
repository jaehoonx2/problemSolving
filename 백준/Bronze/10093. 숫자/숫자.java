import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long bigger = a > b ? a : b;
		long smaller = a < b ? a : b;
		
		if(bigger == smaller){
			System.out.println(0);
			return;
		}
		
		long cnt = bigger - smaller - 1;
		System.out.println(cnt);
		
		for(long i = smaller + 1; i < bigger; i++){
			if(i == bigger - 1)
				System.out.print(i);
			else
				System.out.print(i + " ");
		}
			
	}
}