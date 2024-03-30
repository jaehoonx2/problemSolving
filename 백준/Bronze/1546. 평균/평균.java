import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        double[] arr = new double[n];
        double max = 0.0;
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextDouble();
            max = max < arr[i] ? arr[i] : max; 
        }

        double sum = 0.0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i] / max * 100;

        double avg = sum / arr.length;

                
        System.out.println(avg);
    }
}    