class Solution {
    public String solution(String my_string, int[] indices) {
        char[] arr = my_string.toCharArray();
        
        for(int i = 0; i < indices.length; i++){
            int idx = indices[i];
            arr[idx] = '@';
        }
        
        String answer = "";
        for(int j = 0; j < arr.length; j++)
            answer += (arr[j] != '@') ? Character.toString(arr[j]) : "";
        
        
        return answer;
    }
}