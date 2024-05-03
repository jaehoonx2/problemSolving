import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = a;
		int twoSum = 0;
		max = b > max ? b : max;
		max = c > max ? c : max;
		
		if(max == a)
			twoSum = b + c;
		else if(max == b)
			twoSum = a + c;
		else
			twoSum = a + b;
			
		 int answer = twoSum - max > 0 ? a+b+c : a+b+c - (max - twoSum) - 1;
		 
		 System.out.println(answer);			
	}
}