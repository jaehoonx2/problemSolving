import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int sCnt = n / 2;
		int aCnt = m / 2;
		
		int answer = sCnt < aCnt ? sCnt : aCnt;
		System.out.println(answer);
	}
}