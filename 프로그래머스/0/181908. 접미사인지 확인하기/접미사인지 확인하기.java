class Solution {
    public int solution(String my_string, String is_suffix) {
        if(my_string.contains(is_suffix)){
            return my_string.substring(my_string.length() - is_suffix.length()).compareTo(is_suffix) == 0 ? 1 : 0;
        } else
            return 0;
    }
}