import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length() / 2; i++){
			if(str.charAt(i) != str.charAt(str.length()-1-i)){
				System.out.println(0);
				return;
			}	
		}
		
		System.out.println(1);
	}
}