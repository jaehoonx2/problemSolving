/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		Stack<Long> stack = new Stack<>();
		
		while(n > 0){
			long reminder = n % (long) 2;
			stack.push(reminder);
			n = n / (long) 2;
		}
		
		StringBuilder sb = new StringBuilder();
		
		while(!stack.isEmpty()){
			sb.append(stack.pop());
		}
		
		System.out.println(sb.toString());
	}
}