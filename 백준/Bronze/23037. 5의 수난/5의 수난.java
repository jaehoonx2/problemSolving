import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sum = 0;
		for(char c : str.toCharArray())
			sum += Math.pow(Character.getNumericValue(c), 5);
		System.out.println(sum);
	}
}