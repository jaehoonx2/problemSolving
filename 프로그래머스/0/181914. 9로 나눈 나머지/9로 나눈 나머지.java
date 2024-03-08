class Solution {
    public int solution(String number) {
        int sum = 0;
        
        for(int i = 0; i < number.length(); i++)
            sum += Integer.parseInt(Character.toString(number.charAt(i)));
        
        return sum % 9;
    }
}