import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0)
				break;
			
			if(b % a == 0)
				System.out.println("factor");
			else if(a % b == 0)
				System.out.println("multiple");
			else
				System.out.println("neither");
		}
	}
}