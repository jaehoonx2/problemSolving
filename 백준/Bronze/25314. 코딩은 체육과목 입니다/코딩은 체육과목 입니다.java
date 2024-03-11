import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n -= 4;
        String answer = "long int";
        
        while(n > 0){
            answer = "long " + answer;
            n -= 4;
        }
        
        System.out.println(answer);   
    }
}