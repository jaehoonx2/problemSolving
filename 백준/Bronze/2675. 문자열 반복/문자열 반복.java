import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
 
		for(int i = 0; i < cnt; i++){
			int ct = sc.nextInt();
			String str = sc.next();
 
			String answer = "";
			for(int j = 0; j < str.length(); j++){
				answer += str.substring(j, j+1).repeat(ct);	
			}
 
			System.out.println(answer);
		}
	}
}