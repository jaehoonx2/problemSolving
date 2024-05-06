import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int cnt = nums.length / 2;
        
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                cnt--;
            }
            
            if(cnt == 0)
                break;
        }
        
        return set.size();
    }
}