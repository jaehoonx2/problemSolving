class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;
        
        for(int i : num_list){
            mul *= i;
            sum += i;
        }
            
        return num_list.length > 10 ? sum : mul;
    }
}