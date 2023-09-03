class Solution {
    public int solution(String[] s1, String[] s2) {
        String tmp1;
        String tmp2;
        int answer = 0;
        
        for(int i = 0; i < s1.length; i++){
            tmp1 = s1[i];

            for(int j = 0; j < s2.length; j++){
                tmp2 = s2[j];

                if(tmp1.equals(tmp2) == true){
                    answer++;
                    break;
                }    
            }
        }
        
        
        return answer;
    }
}