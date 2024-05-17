import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++){
			int n = sc.nextInt();
			int sum = 0;
			for(int j = 1; j <= n;){
				sum += j % 2 != 0 ? j : 0;
				j += 2;
			}	
			System.out.println(sum);
		}
	}
}