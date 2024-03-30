import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        
        for(int i = 0; i < cnt; i++){
            String str = sc.next();
            String answer = new String();
            
            if(str.length() > 0){
                answer = str.substring(0, 1);
                answer += str.substring(str.length() - 1, str.length());                
            }

            System.out.println(answer);
        }
    }
}    