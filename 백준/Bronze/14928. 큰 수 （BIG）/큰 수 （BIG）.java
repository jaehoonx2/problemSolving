import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        long remain = 0;

        for(int i=0; i<n.length(); i++){
            remain=(remain*10+n.charAt(i) - '0') % 20000303;
        }
            System.out.println(remain);
        br.close();
    }
}