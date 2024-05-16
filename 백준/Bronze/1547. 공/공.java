import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Boolean> cup = new HashMap<>();
		cup.put(1, true);
		cup.put(2, false);
		cup.put(3, false);
		
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++){
			int first = sc.nextInt();
			boolean firstVal = cup.get(first);
			
			int second = sc.nextInt();
			boolean secondVal = cup.get(second);
			
			cup.replace(first, secondVal);
			cup.replace(second, firstVal);
		}
		
		for(int i : cup.keySet()){
			if(cup.get(i) == true){
				System.out.println(i);
				return;
			}	
			else
				continue;
		}
		
		System.out.println("-1");
	}
}