class Solution {
    public int solution(String s) {
        if(Character.isLetter(s.charAt(0))){
            if(s.charAt(0) == '+'){
                return Integer.parseInt(s.substring(1, s.length() - 1));
            } else {
                return Integer.parseInt(s.substring(1, s.length() - 1)) * -1;
            }
        } else {
            return Integer.parseInt(s);
        }
    }
}