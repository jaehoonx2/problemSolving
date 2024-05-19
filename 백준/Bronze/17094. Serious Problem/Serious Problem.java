import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		
		int cnt2 = 0;
		int cntE = 0;
		
		for(char ch : str.toCharArray()){
			if(ch == '2')
				cnt2++;
			else
				cntE++;
		}
		
		if(cnt2 > cntE)
			System.out.println(2);
		else if(cntE > cnt2)
			System.out.println("e");
		else
			System.out.println("yee");
	}
}