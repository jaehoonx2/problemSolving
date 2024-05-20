import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();	
		String qName = "";
		int qLevel = 5;
		
		while(sc.hasNext()){
			String str = sc.next();
			int level = sc.nextInt();
			
			if(level < qLevel){
				qName = str;
				qLevel = level;
			}
		}
		
		System.out.println(qName);
	}		
}