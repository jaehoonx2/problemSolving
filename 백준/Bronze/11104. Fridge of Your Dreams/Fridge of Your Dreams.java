import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		String n1 = sc.nextLine();
		int n = Integer.parseInt(n1);
		
		for(int k = 0; k < n; k++){
			String num = sc.nextLine();
			StringBuilder sb = new StringBuilder(num);
			sb = sb.reverse();
			String str = sb.toString();
			
			int sum = 0;
			for(int i = 0; i < str.length(); i++)
				sum += Character.getNumericValue(str.charAt(i)) * Math.pow(2, i);
				
			System.out.println(sum);
		}	
	}
}