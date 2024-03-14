import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bucket = new int[n];
        
        for(int l = 0; l < bucket.length; l++)
            bucket[l] = l + 1;
 
        for(int k = 0; k < m; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            
            int temp = bucket[i-1];
            bucket[i-1] = bucket[j-1];
            bucket[j-1] = temp;
        }
        
        for(int o = 0; o < bucket.length; o++)
            if(o != bucket.length - 1)
                System.out.print(bucket[o] + " ");
            else
                System.out.print(bucket[o]);
    }
}