import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Set<Character> vowels = new HashSet<>();
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < cnt; i++){
			String str = br.readLine();
			int consCnt = 0;
			int vowCnt = 0;
            
			for(int j = 0; j < str.length(); j++){
				if(vowels.contains(str.charAt(j)))
					vowCnt++;
				else if(str.charAt(j) != ' ')
					consCnt++;
			}
			System.out.println(consCnt + " " + vowCnt);	
		}
	}
}