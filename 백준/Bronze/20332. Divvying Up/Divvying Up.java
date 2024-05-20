import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		while(sc.hasNext()){
			sum += sc.nextInt();
		}
		
		if(sum % 3 == 0)
			System.out.println("yes");
		else
			System.out.println("no");			
	}
}