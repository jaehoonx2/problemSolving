import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int wc = sc.nextInt();
		int hc = sc.nextInt();
		int ws = sc.nextInt();
		int hs = sc.nextInt();		
		
		if(ws < wc - 1 && hs < hc - 1)
			System.out.println(1);
		else
			System.out.println(0);
	}		
}