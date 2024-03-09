class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++)
            for(int j = 0; j < arr.length; j++)
                arr[j] += (j >= queries[i][0] && j <= queries[i][1]) ? 1 : 0;
        
        return arr;
    }
}