import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		
		int xDif = Math.abs(x2 - x1);
		int yDif = Math.abs(y2 - y1);
		double length = Math.sqrt(Math.pow(xDif, 2) + Math.pow(yDif, 2));
		
		if(length < (double) (r1 + r2))
			System.out.println("YES");
		else
			System.out.println("NO");
	}		
}