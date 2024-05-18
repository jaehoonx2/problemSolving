import java.util.*;
import java.lang.*;
import java.io.*;
 
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int[] univ = new int[3];
		univ[0] = sc.nextInt();
		univ[1] = sc.nextInt();
		univ[2] = sc.nextInt();
		
		if(univ[0] + univ[1] + univ[2] >= 100)
			System.out.println("OK");
		else {
			int min = 100;
			
			for(int i : univ)
				min = i < min ? i : min;
				
			for(int j = 0; j < univ.length; j++)
				if(min == univ[j]){
					switch(j) {
						case 0 : System.out.println("Soongsil"); break;
						case 1 : System.out.println("Korea"); break;
						case 2 : System.out.println("Hanyang"); break;
					}	
				}
		}
	}
}