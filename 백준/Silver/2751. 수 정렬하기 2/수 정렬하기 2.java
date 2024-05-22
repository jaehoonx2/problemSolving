import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
 
		int[] arr = new int[n];
 
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
 
		Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
		
        for(int i = 0; i < arr.length; i++)
			sb.append(Integer.toString(arr[i]) + '\n');
        
        System.out.println(sb.toString());
	}
}