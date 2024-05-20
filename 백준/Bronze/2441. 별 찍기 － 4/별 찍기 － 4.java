import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int oriN = n;
 
		while(n != 0){
			String str = "*".repeat(n);
			String space = " ".repeat(oriN - n);
			System.out.println(space + str);
			n--;
		}
	}
}
