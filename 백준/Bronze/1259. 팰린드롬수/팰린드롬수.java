import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
	
		while(sc.hasNext()){
			String str = sc.nextLine();
			
			if(str.equals("0"))
				continue;
			
			if(str.length() % 2 == 0){
				String subStr1 = str.substring(0, str.length() / 2);
				StringBuilder sb = new StringBuilder(str.substring(str.length() / 2));
				
				if(sb.reverse().toString().equals(subStr1))
					System.out.println("yes");
				else
					System.out.println("no");
			} else {
				String subStr1 = str.substring(0, str.length() / 2);
				StringBuilder sb = new StringBuilder(str.substring(str.length() / 2 + 1));			
			
				if(sb.reverse().toString().equals(subStr1))
					System.out.println("yes");
				else
					System.out.println("no");				
			}
		}
	}
}