import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
 
		int t = sc.nextInt();

		for(int i = 0; i < t; i++){
			String[] strs = sc.next().split(",");
			
			System.out.println(Integer.parseInt(strs[0]) + Integer.parseInt(strs[1]));
		}
	}
}