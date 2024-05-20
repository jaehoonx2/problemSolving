import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		int apples = 0;
		int bananas = 0;
		int scoring = 3;
		while(scoring != 0){
			apples += sc.nextInt() * scoring;
			scoring--;
		}

		scoring = 3;
		
		while(scoring != 0){
			bananas += sc.nextInt() * scoring;
			scoring--;
		}		
		
		if(apples > bananas)
			System.out.println("A");
		else if(bananas > apples)
			System.out.println("B");
		else
			System.out.println("T");
	}
}