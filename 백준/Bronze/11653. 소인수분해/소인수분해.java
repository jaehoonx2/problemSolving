import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 
		if(n == 1)
			return;
 
		int d = 2;//나누는 수, 제수
		int q = n;//몫
		int r = 0;//나머지
 
		while(!isPrime(q)){
			if(q % d == 0){
				r = q % d;
				q = q / d;
 
				System.out.println(d);
			} else
				d = getNextPrime(d);
		}
 
		System.out.print(q);
	}
 
	public static boolean isPrime(int num){
		if(num == 2)
			return true;
 
		for(int i = 2; i < (int) Math.sqrt(num) + 1; i++){
			if(num % i == 0)
				return false;
		}
 
		return true;
	}
 
	public static int getNextPrime(int num){
		num += 1;
 
		while(!isPrime(num)){
			num += 1;
		}
 
		return num;
	}
}