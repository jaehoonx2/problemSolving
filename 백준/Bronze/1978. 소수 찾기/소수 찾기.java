import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			int noPrimeCnt = 0;
			
			while(sc.hasNext()){
				int k = sc.nextInt();
				
				if(k == 1)
					noPrimeCnt++;
				else if(k == 2)
					continue;
				
				for(int j = 2; j < k; j++){
					if(k % j == 0){
						noPrimeCnt++;
						break;
					}
				}
			}
			
			System.out.println(n - noPrimeCnt);
	}
}