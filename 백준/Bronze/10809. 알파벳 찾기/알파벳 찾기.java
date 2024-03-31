import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		// a = 0, b = 1, ... , z = 25
		int[] arr = new int[26];
		for(int idx = 0; idx < arr.length; idx++)
			arr[idx] = -1;
		
		int a = (int) 'a';
		int z = (int) 'z';
		
		for(int i = 0; i < str.length(); i++){
			for(int j = 'a'; j <= z; j++){
				if(str.charAt(i) == j && arr[j - a] == -1){
					arr[j - a] = i;
				}
			}	
		}
		
		for(int idx = 0; idx < arr.length; idx++)
			if(idx != arr.length - 1)
				System.out.print(arr[idx] + " ");
			else
				System.out.print(arr[idx]);	
	}
}