import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sec = 0;
		int num = 0;
		
		while(n != 0){
			sec += 1;			
			num += 1;
			
			if(num <= n)
				n -= num;
			else {
				num = 0;
				sec -= 1;
			}
		}

		System.out.println(sec);
	}
}