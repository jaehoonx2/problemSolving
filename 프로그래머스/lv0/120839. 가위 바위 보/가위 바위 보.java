class Solution {
    public String solution(String rsp) {
        StringBuilder rspSb = new StringBuilder(rsp);
        StringBuilder win = new StringBuilder();
        
        for(int i = 0; i < rspSb.length(); i++){
            switch(rspSb.charAt(i)){
                case '2' : win.append('0');
                    break;
                case '0' : win.append('5');
                    break;
                case '5' : win.append('2');    
            }
        }
        
        String answer = win.toString();
        return answer;
    }
}