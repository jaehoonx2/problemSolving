import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int time = sc.nextInt();
        int h2 = time / 60;
        int m2 = time % 60;
        int h3, m3;

        if(m1 + m2 >= 60){
            h3 = h1 + h2 + 1 > 23 ? (h1 + h2 + 1) % 24 : h1 + h2 + 1;
            m3 = (m1 + m2) % 60;
        } else {
            h3 = h1 + h2 > 23 ? (h1 + h2) % 24 : h1 + h2;
            m3 = m1 + m2;
        }

        System.out.println(h3 + " " + m3);
    }
}