import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[n];
        for(int x = 0; x < n; x++)
            arr[x] = x + 1;
        
        for(int y = 0; y < m; y++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            
            getReverse(arr, i, j);
        }
        
        for(int i = 0; i < arr.length; i++)
            if(i != arr.length - 1)
                System.out.print(arr[i] + " ");
            else
                System.out.print(arr[i]);
    }
    
    public static void getReverse(int[] arr, int i, int j){
        int distance = j - i;
        int cnt = 0;
        
        if(distance == 0)
            cnt = 0;
        else if(distance % 2 == 0)
            cnt = distance / 2;
        else 
            cnt = (distance / 2) + 1;
    
        for(int idx = 0; idx < cnt; idx++){
            int temp = arr[i - 1 + idx];
            arr[i - 1 + idx] = arr[j - 1 - idx];
            arr[j - 1 - idx] = temp;
        }
    }
}