import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int S = sc.nextInt();
		int riceCnt = (T >= 12 && T <= 16) ? (S == 1 ? 280 : 320) : 280;
		
		System.out.println(riceCnt);
	}
}