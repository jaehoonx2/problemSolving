class Solution {
    public int solution(String binomial) {
        int a = 0;
        int b = 0;
        char op = '1';
        
        binomial = binomial.replace(" ", "");
        
        for(int i = 0; i < binomial.length(); i++){
            if(!Character.isDigit(binomial.charAt(i))){
                a = Integer.parseInt(binomial.substring(0, i));
                b = Integer.parseInt(binomial.substring(i + 1));
                op = binomial.charAt(i);
                
                break;
            }
        }
        
        switch(op){
            case '+' : return a + b;
            case '-' : return a - b;
            case '*' : return a * b;
        }
        
        return -1;
    }
}