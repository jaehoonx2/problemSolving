import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; ; i++){
			int[] n = new int[5];
			n[0] = sc.nextInt();
			
			if(n[0] == 0)
				break;
			
			n[1] = 3 * n[0];
			n[2] = n[1] % 2 == 0 ? n[1] / 2 : (n[1] + 1) / 2;
			n[3] = 3 * n[2];
			n[4] = n[3] / 9;
			/*
			if(n[1] % 2 == 0)
				n[0] = 2 * n[4];
			else
				n[0] = 2 * n[4] + 1;
			*/
			if(n[1] % 2 != 0)
				System.out.println(i+". " + "odd " + n[4]);
			else
				System.out.println(i+". " + "even " + n[4]);
		}
	}
}