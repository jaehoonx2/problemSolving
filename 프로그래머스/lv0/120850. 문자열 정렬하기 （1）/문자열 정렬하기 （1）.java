import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        char[] arr = my_string.toCharArray();
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++)
            if(Character.isDigit(arr[i]))
                al.add(Character.getNumericValue(arr[i]));
        
        int[] answer = al.stream().mapToInt(Integer::intValue).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}