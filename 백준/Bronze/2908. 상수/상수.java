import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
 
		StringBuilder sba = new StringBuilder(a);
		StringBuilder sbb = new StringBuilder(b);
 
		sba = sba.reverse();
		sbb = sbb.reverse();
 
		int inta = Integer.parseInt(sba.toString());
		int intb = Integer.parseInt(sbb.toString());
 
		int max = inta > intb ? inta : intb;
 
		System.out.println(max);
 
	}
}