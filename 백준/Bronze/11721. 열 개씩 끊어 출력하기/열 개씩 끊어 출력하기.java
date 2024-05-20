import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		while(str.length() != 0){
			if(str.length() >= 10){
				System.out.println(str.substring(0, 10));
				str = str.substring(10);
			} else {
				System.out.println(str);
				str = "";
			}
		}
	}
}