class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int calCd; // 1: >= 2: <= 3: > 4: <
        
        if(ineq.compareTo(">") == 0){
            if(eq.compareTo("=") == 0)
                calCd = 1;
            else
                calCd = 3;
        } else {
            if(eq.compareTo("=") == 0)
                calCd = 2;
            else
                calCd = 4;
        }
        
        switch(calCd){
            case 1 : return n >= m ? 1 : 0;
            case 2 : return n <= m ? 1 : 0;
            case 3 : return n >  m ? 1 : 0;
            case 4 : return n <  m ? 1 : 0;
        }
        
        return -1;
    }
}