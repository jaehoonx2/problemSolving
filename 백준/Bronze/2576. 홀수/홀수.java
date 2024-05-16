import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int min = 100;
		
		while(sc.hasNext()){
			int num = sc.nextInt();
			
			sum += num % 2 == 0 ? 0 : num;
			
			if(num % 2 != 0)
				min = num < min ? num : min; 
		}
		
		if(sum == 0)
			System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}