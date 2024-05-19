import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++){
			String str = sc.nextLine();
			if(str.length() >= 6 && str.length() <= 9)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}