class Solution {
    public int solution(String my_string, String is_prefix) {
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.substring(0, i + 1).compareTo(is_prefix) == 0)
                return 1;
        }
        
        return 0;
    }
}