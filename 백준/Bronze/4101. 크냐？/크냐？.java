import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0)
				break;
			else {
				boolean isBigger = a > b ? true : false;
				
				if(isBigger)
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}
	}
}