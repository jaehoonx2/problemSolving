import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		int answer = a - (a * (b / 100)) >= (double) 100 ? 0 : 1;
		System.out.println(answer);
	}
}