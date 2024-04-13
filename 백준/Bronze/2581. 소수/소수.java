import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
			int m = sc.nextInt();
			int n = sc.nextInt();
			
			int sum = 0;
			int min = n;
			int cnt = 0;
			
			for(int i = m; i <= n; i++){
				// 1은 소수가 아님
				if(i == 1)
					continue;
				// 2면 소수임
				else if(i == 2){
					sum += i;
					min = i < min ? i : min; 
					cnt++;
				} else {
					int j = 2;
					for(; j < i; j++)
						if(i % j == 0)
							break;
					
					if(i == j){ // 소수
						sum += i;
						min = i < min ? i : min; 
						cnt++;
					}						
				}
			}
			if(cnt != 0){
				System.out.println(sum);
				System.out.println(min);
			} else {
				System.out.println(-1);
			}
	}
}