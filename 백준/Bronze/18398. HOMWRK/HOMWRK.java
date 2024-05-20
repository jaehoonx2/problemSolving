import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++){
			int b = sc.nextInt();
			
			for(int j = 0; j < b; j++){
				int c = sc.nextInt();
				int d = sc.nextInt();	
				System.out.println((c+d) + " " + (c*d));
			}
		}
	}
}