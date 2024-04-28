import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 0. 정답 갯수 구하기
        int[] cnt = new int[3];
        for(int i = 0; i < answers.length; i++){
            cnt[0] += answers[i] == getNo1Answer(i) ? 1 : 0;
            cnt[1] += answers[i] == getNo2Answer(i) ? 1 : 0;
            cnt[2] += answers[i] == getNo3Answer(i) ? 1 : 0;
        }
        
        // 1. 최대정답자 인원 수 구하기
        int cutLine = cnt[0] > cnt[1] ? (cnt[0] > cnt[2] ? cnt[0] : cnt[2]) : (cnt[1] > cnt[2] ? cnt[1] : cnt[2]);
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i = 0; i < cnt.length; i++)
            if(cnt[i] == cutLine)
                al.add(i+1);
        
        // 2. 리턴
        int[] answer = new int[al.size()];
        for(int i = 0; i < answer.length; i++)
            answer[i] = al.get(i);
        
        
        return answer;
    }
    
    public int getNo1Answer(int idx){
        int order = idx + 1;
        return order % 5 == 0 ? 5 : order % 5;
    }
    
    public int getNo2Answer(int idx){
        switch(idx % 8){
            case 0 : case 2 : case 4 : case 6 : return 2;
            case 1 : return 1;
            case 3 : return 3;
            case 5 : return 4;
            case 7 : return 5;
        }
        
        return -1;
    }
    
    public int getNo3Answer(int idx){
        idx -= idx % 2 != 0 ? 1 : 0;
        
        switch(idx % 10) {
            case 0 : return 3;
            case 2 : return 1;
            case 4 : return 2;
            case 6 : return 4;
            case 8 : return 5;
            default : return -1;
        }
    }
}