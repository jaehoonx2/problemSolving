import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int v = 0;
        int answer = 0;
        
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        v = sc.nextInt();
        for(int i : arr)
            answer += i == v ? 1 : 0;

        System.out.println(answer);
    }
}