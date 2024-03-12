import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int aVal, bVal, cVal;
        int aIdx = 0;
        int bIdx = 0;
        int cIdx = 0;        
        int[] rank2 = Arrays.copyOf(rank, rank.length);
        int dummyRank = rank.length + 1;
        
        for(int i = 0; i < rank2.length; i++)
            rank2[i] = attendance[i] ? rank2[i] : dummyRank++;
        
        Arrays.sort(rank2);
    
        aVal = rank2[0];
        bVal = rank2[1];
        cVal = rank2[2];

        for(int j = 0; j < rank.length; j++)
            if(rank[j] == aVal)
                aIdx = j;
            else if(rank[j] == bVal)
                bIdx = j;
            else if(rank[j] == cVal)  
                cIdx = j;
            else
                continue;
        
        return 10000 * aIdx + 100 * bIdx + cIdx;
    }
}