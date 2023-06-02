class Solution {
    public String solution(int[] food) {
        
        //1. 칼로리 별 음식이 홀수일 경우 1개씩 버리기 
        for(int i = 1; i < food.length; i++){
            if(food[i] % 2 != 0)
                food[i] = food[i] - 1;
        }
        
        String left = "";
        String right = "";
        String tmp = "";
        
        //2. 음식 배치
        for(int j = 1; j < food.length; j++){
            //음식 반절씩 왼쪽 오른쪽 세팅
            for(int k = 0; k < food[j]/2; k++){
                //왼쪽 세팅
                left = left.concat(Integer.toString(j));
                
                //오른쪽 세팅
                tmp = "";
                tmp = tmp.concat(Integer.toString(j));
                right = tmp.concat(right); 
            }
        }        
        
        String answer = "";
        
        answer = answer.concat(left);
        answer = answer.concat("0");
        answer = answer.concat(right);
        
        return answer;
    }
}