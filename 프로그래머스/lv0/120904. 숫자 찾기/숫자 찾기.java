class Solution {
    public int solution(int num, int k) {
        char[] arr = String.valueOf(num).toCharArray();
        
        int answer = -1;
        for(int i = 0; i < arr.length; i++){
            if(Character.getNumericValue(arr[i]) == k){
                answer = i+1;
                break;
            }
        }
        
        return answer;
    }
}