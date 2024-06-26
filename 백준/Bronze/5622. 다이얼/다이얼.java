import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Map<Character, Integer> map = new HashMap<>();
		map.put('A', 2);
		map.put('B', 2);
		map.put('C', 2);
		map.put('D', 3);
		map.put('E', 3);
		map.put('F', 3);
		map.put('G', 4);
		map.put('H', 4);
		map.put('I', 4);
		map.put('J', 5);
		map.put('K', 5);
		map.put('L', 5);
		map.put('M', 6);
		map.put('N', 6);
		map.put('O', 6);
		map.put('P', 7);
		map.put('Q', 7);
		map.put('R', 7);
		map.put('S', 7);
		map.put('T', 8);
		map.put('U', 8);
		map.put('V', 8);
		map.put('W', 9);
		map.put('X', 9);
		map.put('Y', 9);
		map.put('Z', 9);
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int sum = 0;
		for(int i = 0; i < str.length(); i++){
			int num = map.get(str.charAt(i));
			sum += num == 0 ? 10 : num + 1;
		}
		
		System.out.println(sum);
	}
}