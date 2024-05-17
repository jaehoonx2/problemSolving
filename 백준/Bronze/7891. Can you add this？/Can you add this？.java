import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println((a+b));
		}
	}
}