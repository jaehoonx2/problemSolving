import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 1000001;
        int max = -1000001;    //n의 범위가 1부터인지 -1000000부터인지 애매모호
        
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            
            min = x < min ? x : min;
            max = x > max ? x : max;
        }
        
        System.out.println(min + " " + max);
    }
}