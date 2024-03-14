import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for(int i = 1; i <= cnt; i++)
            System.out.println(" ".repeat(cnt-i) + "*".repeat(i));
    }
}