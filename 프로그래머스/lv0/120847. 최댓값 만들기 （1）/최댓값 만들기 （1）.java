class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        bubbleSort(numbers, numbers.length);
        
        return numbers[0] * numbers[1];
    }
    
    static void swap(int a[], int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    
    static void bubbleSort(int a[], int n) {
        for(int i = 0; i < 2; i++) //가장 큰 수 2개만 알면 되니까 버블정렬 2회차만 실시
            for(int j = n-1; j > i; j--)
                if(a[j] > a[j-1])
                    swap(a, j, j-1);
    }
}
