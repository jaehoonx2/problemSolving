import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		int squareSum = 0;
		
		while(sc.hasNext()){
			int num = sc.nextInt();
			squareSum += num * num;
		}
		
		System.out.println(squareSum % 10);
	}
}