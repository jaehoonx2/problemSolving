import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i < 3; i++){
			int chicken = sc.nextInt();
			cnt += n <= chicken ? n : chicken;
		}
		System.out.println(cnt);
	}
}