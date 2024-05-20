import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		int ants = sc.nextInt();
		int eyes = sc.nextInt();
		
		if(ants > 6){        // 6~
			if(eyes <= 4)
				System.out.println("TroyMartian");
			else
				return;
		} else if(ants > 2) { // 3~6
			if(eyes <= 4)
				System.out.println("TroyMartian");
				
			if(eyes >= 2)
				System.out.println("VladSaturnian");
		} else {			 // 0~2
			if(eyes > 1)
				System.out.println("VladSaturnian");
			
			if(eyes <= 3)
				System.out.println("GraemeMercurian");
		}
	}
}