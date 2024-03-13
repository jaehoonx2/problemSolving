class Solution {
    public String[] solution(String[] quiz) {        
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] exp = quiz[i].split(" ");
            
            int a      = Integer.parseInt(exp[0]);
            int b      = Integer.parseInt(exp[2]);
            int result = Integer.parseInt(exp[4]);
            
            switch(exp[1]){
                case "+" : answer[i] = a + b == result ? "O" : "X"; break;
                case "-" : answer[i] = a - b == result ? "O" : "X"; break;
            }
        }
        
        return answer;
    }
}