class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        String answer = sb.reverse().substring(0);
        return answer;
        
        /*
        2안
        char arr[] = my_string.toCharArray();
        int l = arr.length;                      //length
        int r = (l % 2 == 0) ? l/2 - 1 : l/2;    //range
        String answer; 
        
        if(l == 1){
            answer = my_string;
        } else {
            for(int i = 0; i < r; i++){
                char tmpChar = arr[l-i-1];
                arr[l-i-1] = arr[i];
                arr[i] = tmpChar;            
            } 
            
            answer = new String(arr);
        }
        
        return answer;
        */
    }
}