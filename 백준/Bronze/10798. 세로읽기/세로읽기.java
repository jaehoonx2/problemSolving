/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
		String[] str = new String[5];
		int max = 0;
		for(int i = 0; i < str.length; i++){
			str[i] = sc.nextLine();
			max = str[i].length() > max ? str[i].length() : max;
		}
		
		char[][] chars = new char[5][max];
		for(int i = 0; i < chars.length; i++){
			for(int j = 0; j < chars[i].length; j++){
				chars[i][j] = j > str[i].length() - 1 ? '*' : str[i].charAt(j);
			}
		}
		
		String answer = "";
		for(int j = 0; j < chars[0].length; j++){
			for(int i = 0; i < 5; i++){
				if(chars[i][j] != '*')
					answer += chars[i][j]; 		
			}
		}
		
		System.out.println(answer);
	}
}