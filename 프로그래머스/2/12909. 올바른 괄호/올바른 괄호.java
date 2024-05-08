import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        
        for(char ch : arr){
            if(ch == ')') {
                if(stack.isEmpty())
                    return false;
                else
                    stack.pop();
            } else 
                stack.push('(');
            }
        return stack.isEmpty() ? true : false; 
    }
}