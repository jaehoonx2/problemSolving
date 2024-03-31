import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toUpperCase();
		
		int[] arr = new int[26];
		int a = (int) 'A';
		
		for(int i = 0; i < str.length(); i++){
			int idx = (int) str.charAt(i) - a;
			arr[idx]++;
		}
		
		int maxIdx = 0;
		int maxCnt = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > maxCnt){
				maxCnt = arr[i];
				maxIdx = i;
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == arr[maxIdx])
				cnt++;
		}
		
		int ch = (int) 'A' + maxIdx;
		
		if(cnt > 1)
			System.out.println("?");
		else
			System.out.println((char) ch);
	}
}