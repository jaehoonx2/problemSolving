import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(sc.hasNext()){
			int total = sc.nextInt();
			
			int quarter = total / 25;
			total = total % 25;
			
			int dime = total / 10;
			total = total % 10;
			
			int nickel = total / 5;
			total = total % 5;
			
			int penny = total;
			
			System.out.printf("%d %d %d %d\n", quarter, dime, nickel, penny);
		}
	}
}