class Solution {
    public int solution(int n) {
        int hapsungsu[] = new int[n];        
        
        for(int i=0; i<n; i++){
            // 1.초기화
            hapsungsu[i] = 0;
            
            // 2.합성수 갯수 카운트 시작
            for(int j=1; j<=i+1; j++){
                if((i+1) % j == 0)
                    hapsungsu[i]++;
            }
        }

        int count = 0;
        
        for(int k=0; k < hapsungsu.length; k++)
            if(hapsungsu[k] >= 3)
                count++;
        
        return count;
    }
}