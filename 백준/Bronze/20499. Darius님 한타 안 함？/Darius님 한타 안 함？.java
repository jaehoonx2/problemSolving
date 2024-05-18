import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] kda = str.split("/");
		String answer = (Integer.parseInt(kda[0]) + Integer.parseInt(kda[2]) < Integer.parseInt(kda[1])) || (Integer.parseInt(kda[1]) == 0) ? "hasu" : "gosu";
		System.out.println(answer);
	}
}