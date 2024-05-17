import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int cnt = Integer.parseInt(br.readLine());
 
		for(int i = 0; i < cnt; i++){
			String str = br.readLine();
			String[] grades = str.split(" ");
 
			int score = Integer.parseInt(grades[1]);
 
			if(score >= 97)
				System.out.println(grades[0]+ " " + "A+");
			else if(score >= 90)
				System.out.println(grades[0]+ " " + "A");
			else if(score >= 87)
				System.out.println(grades[0]+ " " + "B+");
			else if(score >= 80)
				System.out.println(grades[0]+ " " + "B");
			else if(score >= 77)
				System.out.println(grades[0]+ " " + "C+");
			else if(score >= 70)
				System.out.println(grades[0]+ " " + "C");
			else if(score >= 67)
				System.out.println(grades[0]+ " " + "D+");				
			else if(score >= 60)
				System.out.println(grades[0]+ " " + "D");
			else
				System.out.println(grades[0]+ " " + "F");
		}
	}
}