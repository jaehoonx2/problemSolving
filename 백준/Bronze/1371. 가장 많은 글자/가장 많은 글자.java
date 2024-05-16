import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> map = new HashMap<>();
		
		while(sc.hasNext()){
			String str = sc.nextLine();
			
			for(int i = 0; i < str.length(); i++){
				if(str.charAt(i) == ' ')
					continue;
				
				if(map.keySet().contains(str.charAt(i)))
					map.replace(str.charAt(i), map.get(str.charAt(i)) + 1);
				else
					map.put(str.charAt(i), 1);
			}
		}
		
		int maxCnt = 0;
		for(char ch : map.keySet())
			maxCnt = map.get(ch) > maxCnt ? map.get(ch) : maxCnt; 	
		
		String answer = new String();
		for(char ch : map.keySet())
			if(map.get(ch) == maxCnt)
				answer += ch;
		
		if(answer.length() == 1)
			System.out.println(answer);
		else {
			char[] arr = answer.toCharArray();
			Arrays.sort(arr);
			System.out.println(new String(arr));
		}
	}
}