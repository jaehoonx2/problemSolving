import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		int[] std = {1, 1, 2, 2, 2, 8};
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++){
			int num = sc.nextInt();
			System.out.print(std[i] - num + " ");
		}
	}
}