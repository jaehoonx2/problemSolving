class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;
        
        for(int i : num_list){
            mul *= i;
            sum += i;
        }
        
        // 같은 경우는 문제에서 주어지지 않았으므로 -1 리턴
        return mul < sum*sum ? 1 : mul > sum*sum ? 0 : -1;
    }
}