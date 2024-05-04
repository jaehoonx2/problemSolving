import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B = sc.nextInt();

		Map<Integer, String> map = new HashMap<>();
		for(int i = 0; i < 10; i++)
			map.put(i, Integer.toString(i)); //0~9
		
		for(int i = 0; i < 26; i++)
			map.put(i + 10, Character.toString((char)((int) 'A' + i))); //A~Z
		
		String answer = "";
		int d = B;
		int q = N;
		int r = 0;
		while(q >= d){
			r = q % d;
			q = q / d;
			answer = map.get(r) + answer;
		}
		answer =  map.get(q) + answer;
		
		System.out.println(answer);
	}
}