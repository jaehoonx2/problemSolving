import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        if(n == 1){
            return Arrays.copyOfRange(num_list, 0, slicer[1] + 1); 
        } else if(n == 2){
            if(slicer[0] == num_list.length - 1)
                return new int[]{num_list[slicer[0]]};
            else
                return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
        } else if(n == 3){
            if(slicer[0] == slicer[1])
                return new int[]{num_list[slicer[0]]};
            else
                return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
        } else {
            ArrayList<Integer> al = new ArrayList<>();
            for(int i = slicer[0]; i <= slicer[1]; i += slicer[2])
                al.add(num_list[i]);

            int[] answer = new int[al.size()];
            for(int j = 0; j < answer.length; j++)
                answer[j] = al.get(j);

            return answer;            
        }
    }
}