import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		int winCnt = 0;
		
		while(sc.hasNext()){
			String ch = sc.next();
			winCnt += ch.equals("W") ? 1 : 0;	
		}
		
		if(winCnt > 4)
			System.out.println(1);
		else if(winCnt > 2)
			System.out.println(2);
		else if(winCnt > 0)
			System.out.println(3);
		else
			System.out.println(-1);
	}
}