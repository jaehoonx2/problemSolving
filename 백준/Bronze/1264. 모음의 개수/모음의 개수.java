import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Set<Character> set = new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		set.add('A');
		set.add('E');
		set.add('I');
		set.add('O');
		set.add('U');
		
		Scanner sc = new Scanner(System.in);
	
		while(sc.hasNext()){
			String str = sc.nextLine();
			
			if(str.equals("#"))
				continue;
				
			int cnt = 0;
			
			for(int i = 0; i < str.length(); i++)
				cnt += set.contains(str.charAt(i)) ? 1 : 0;
			
			System.out.println(cnt);
		}
	}
}