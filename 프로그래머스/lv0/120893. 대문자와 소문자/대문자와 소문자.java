class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < arr.length; i++)
            if(Character.isUpperCase(arr[i]))
                answer.append(Character.toLowerCase(arr[i]));
            else
                answer.append(Character.toUpperCase(arr[i]));
        
        return answer.toString();
    }
}