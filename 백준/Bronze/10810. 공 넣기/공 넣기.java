import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();    
        int[] bucket = new int[n];
        
        for(int x = 0; x < m; x++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            
            for(int y = i-1; y <= j-1; y++)
                bucket[y] = k;
        }
        
        for(int z = 0; z < bucket.length; z++){
            System.out.print(bucket[z]);
            
            if(z != bucket.length - 1)
                System.out.print(" ");
        }    
    }
}