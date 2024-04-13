import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == -1)
				break;
				
			int sum = 1;
			String str = n + " = 1";
			
			for(int i = 2; i < n; i++) {
				if(n % i == 0){
					sum += i;
					str += " + "  + i;
				}
			}
			
			if(sum == n)
				System.out.println(str.trim());
			else
				System.out.println(n + " is NOT perfect.");
		}
	}
}