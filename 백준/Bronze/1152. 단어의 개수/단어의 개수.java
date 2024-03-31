import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.trim();
		
		if(str.equals("")){
			System.out.println(0);
			return;
		}
 
		String[] slice = str.split(" ");
		
		System.out.println(slice.length);
	}
}