import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        String str = sc.next();
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++)
			sum += Character.getNumericValue(arr[i]);
            
        System.out.println(sum);            

    }
}