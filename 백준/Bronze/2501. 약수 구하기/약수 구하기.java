import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int cnt = 0;
			for(int i = 1; i <= n; i++){
				if(n % i == 0)
					cnt++;
					
				if(cnt == k){
					System.out.println(i);
					return;
				}
			}
			
			System.out.println(0);
	}
}