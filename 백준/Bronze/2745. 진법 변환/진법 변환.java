import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int B = sc.nextInt();

		Map<String, Integer> map =new HashMap<>();
		for(int i = 0; i < 10; i++)
			map.put(Integer.toString(i), i); //0~9
		
		for(int i = 0; i < 26; i++)
			map.put(Character.toString((char)((int) 'A' + i)), i + 10);
		
		int answer = 0;	
		for(int i = N.length() - 1; i >= 0; i--){
			String str = N.substring(i, i+1);
			answer += map.get(str) * (int) Math.pow(B, N.length() - 1 - i);
		}
		
		System.out.println(answer);
	}
}