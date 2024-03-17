class Solution {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        
        for(int i = 0; i < s.length(); i++)
            if(s.substring(i, i+1).toLowerCase().equals("p"))
                pCnt++;
            else if(s.substring(i, i+1).toLowerCase().equals("y"))
                yCnt++;
            
            return pCnt == yCnt ? true : false;
    }
}