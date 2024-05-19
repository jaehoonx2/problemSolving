import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int sum = 1*s + 2*m + 3*l;
		if(sum < 10)
			System.out.println("sad");
		else
			System.out.println("happy");
	}
}