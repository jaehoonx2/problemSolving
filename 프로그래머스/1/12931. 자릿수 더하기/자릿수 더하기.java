import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        char[] arr = Integer.toString(n).toCharArray();
        
        for(int i = 0; i < arr.length; i++)
            sum += Character.getNumericValue(arr[i]);

        return sum;
    }
}