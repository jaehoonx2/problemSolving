import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
            num[i] = num[i] % 42;
            
            set.add(num[i]);
        }
        
        System.out.println(set.size());
    }
}