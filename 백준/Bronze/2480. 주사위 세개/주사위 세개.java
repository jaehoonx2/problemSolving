import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && b == c)
            System.out.println(10000 + a * 1000);
        else if(a != b && b != c & c != a){
            int biggest = a > b ? (a > c ? a : c) : (b > c ? b : c);
            System.out.println(biggest * 100);
        } else {
            int same = a == b ? a : (b == c ? b : c);
            System.out.println(1000 + same * 100);
        }
    }
}