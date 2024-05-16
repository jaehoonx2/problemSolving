import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.nextLine());
		sb = sb.reverse();
		String str = sb.toString();
		
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++){
			if(Character.isDigit(str.charAt(i))){
				sum += Character.getNumericValue(str.charAt(i)) * (int) Math.pow(16, i);
			} else {
				switch(str.charAt(i)){
					case 'A' : sum += 10 * (int) Math.pow(16, i); break; 
					case 'B' : sum += 11 * (int) Math.pow(16, i); break;
					case 'C' : sum += 12 * (int) Math.pow(16, i); break;
					case 'D' : sum += 13 * (int) Math.pow(16, i); break;
					case 'E' : sum += 14 * (int) Math.pow(16, i); break;
					case 'F' : sum += 15 * (int) Math.pow(16, i); break;
				}
			}
		}
		
		System.out.println(sum);
	}
}