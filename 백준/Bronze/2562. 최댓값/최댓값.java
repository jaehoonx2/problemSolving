import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxIdx = 0;
        int maxVal = 1;    
        
        for(int i = 1; i <= 9; i++){
            int num = sc.nextInt();
            
            if(num > maxVal){
                maxVal = num;
                maxIdx = i;
            }
        }
        
        System.out.println(maxVal + " " + maxIdx);
    }
}