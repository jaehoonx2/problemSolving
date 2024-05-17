import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
        
		int teaType = sc.nextInt();
        
		int cnt = 0;
        
		while(sc.hasNext()){
			int tmp = sc.nextInt();
			cnt += tmp == teaType ? 1 : 0;
		}
        
		System.out.println(cnt);
	}
}