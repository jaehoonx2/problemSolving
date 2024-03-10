class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        for(int i = 1; ; i++){
            int cnt = 0;
            
            for(String str : strArr){
                if(str.length() == i)
                    cnt++;
            }
            
            answer = (cnt > answer) ? cnt : answer;
            
            if(cnt == 0)
                break;
        }
        
        return answer;
    }
}