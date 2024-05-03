import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int paperNum = sc.nextInt();
		int[][] coord = new int[100][100];
		int[][] paper = new int[paperNum][2];
		
		for(int i = 0; i < paper.length; i++)
			for(int j = 0; j < paper[i].length; j++)
				paper[i][j] = sc.nextInt();
				
		for(int l = 0; l < paper.length; l++){
			int x = paper[l][0];
			int y = paper[l][1];
			
			int xEnd = paper[l][0] + 10 > 100 ? 100 : paper[l][0] + 10;
			int yEnd = paper[l][1] + 10 > 100 ? 100 : paper[l][1] + 10;
			
			for(int i = paper[l][0]; i < xEnd; i++){
				for(int j = paper[l][1]; j < yEnd; j++){
					coord[i][j] += 1;
				}
			}
		}
		
		int answer = 0;
		for(int i = 0; i < coord.length; i++)
			for(int j = 0; j < coord[i].length; j++)
				answer += coord[i][j] > 0 ? 1 : 0;
				
		System.out.println(answer);
	}
}