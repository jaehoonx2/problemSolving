import java.lang.*;

class Solution {
    public String solution(String a, String b) {
        StringBuilder l = new StringBuilder(a.length() < b.length() ? b : (a.length() > b.length() ? a : b));
        StringBuilder s = new StringBuilder(a.length() < b.length() ? a : (a.length() > b.length() ? b : a));
        
        String longer  = l.reverse().toString();
        String shorter = s.reverse().toString();

        longer  = longer  + "0";
        shorter = shorter + "0".repeat(longer.length() - shorter.length());
        
        char[] arr1 = longer.toCharArray();
        char[] arr2 = shorter.toCharArray();

        String answer = "";
        int ollim = 0;
        for(int i = 0; i < longer.length(); i++){
            int sum = Character.getNumericValue(arr1[i]) + Character.getNumericValue(arr2[i]) + ollim;
            ollim = sum >= 2 ? 1 : 0;
            answer = Integer.toString(sum % 2) + answer;
        }
        
        return answer.charAt(0) == '0' ? answer.substring(1) : answer;
    }
}