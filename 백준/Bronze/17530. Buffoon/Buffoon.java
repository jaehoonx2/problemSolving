import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		Long score = sc.nextLong();
		String answer = "S";
		while(sc.hasNext()){
			Long tmp = sc.nextLong();
			
			if(score - tmp < 0){
				answer = "N";
				break;
			} else
				continue;
		}
		
		System.out.println(answer);
	}
}