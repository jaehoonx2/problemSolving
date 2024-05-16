import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		while(sc.hasNext()){
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x >= y)
				System.out.println("MMM BRAINS");
			else
				System.out.println("NO BRAINS");				
		}
	}
}