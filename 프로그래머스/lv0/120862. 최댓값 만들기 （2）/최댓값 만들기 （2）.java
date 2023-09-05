class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        bubbleSortAsc(numbers, numbers.length);
        
        answer = numbers[0] * numbers[1];
        
        bubbleSortDesc(numbers, numbers.length);
        
        answer = (answer > numbers[0] * numbers[1]) ? answer : numbers[0] * numbers[1];
        
        return answer;
    }
    
    static void swap(int a[], int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    
    static void bubbleSortAsc(int a[], int n) {
        for(int i = 0; i < 2; i++) //가장 큰 수 2개만 알면 되니까 버블정렬 2회차만 실시
            for(int j = n-1; j > i; j--)
                if(a[j] > a[j-1])
                    swap(a, j, j-1);
    }
    

    static void bubbleSortDesc(int a[], int n) {
        for(int i = 0; i < 2; i++) //가장 작은 수 2개만 알면 되니까 버블정렬 2회차만 실시
            for(int j = n-1; j > i; j--)
                if(a[j] < a[j-1])
                    swap(a, j, j-1);
    }    
}
