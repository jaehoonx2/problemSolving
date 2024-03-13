class Solution {
    public long solution(String numbers) {
        String answer = "";
        String[] engNums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        while(numbers.length() > 0){
            for(int i = 0; i < engNums.length; i++){
                if(numbers.startsWith(engNums[i])){
                    answer = answer + Integer.toString(i);
                    numbers = numbers.length() == engNums[i].length() ? "" : numbers.substring(engNums[i].length());                       break;
                }
            }
        }
        
        return Long.parseLong(answer);
    }
}