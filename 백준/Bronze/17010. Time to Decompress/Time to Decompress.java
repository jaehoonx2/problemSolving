import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			String b = sc.next();
			String answer = b.repeat(a);
			System.out.println(answer);
		}
	}
}