class Solution {
    public String solution(String polynomial) { 
        String answer = "";
        String[] exp = polynomial.split(" ");
        
        int xCnt = 0;   // x의 계수
        int c    = 0;   // 상수
        
        for(int i = 0; i < exp.length; i++){
            if(!exp[i].equals("+")){
                if(exp[i].contains("x"))
                    xCnt += exp[i].equals("x") ? 1 : Integer.parseInt(exp[i].substring(0, exp[i].length()-1));
                else
                    c += Integer.parseInt(exp[i]);
            }
        }
        
        String a = xCnt > 0 ? (xCnt > 1 ? Integer.toString(xCnt) + "x" : "x") : "";
        String b = c > 0 ? Integer.toString(c) : "";
        
        if(a.length() > 0 && b.length() > 0)
            answer = a + " + " + b;
        else if(b.length() == 0){
            answer = a;
        } else {
            answer = b;
        }
        
        return answer;
    }                   
}