class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int midVal = (int) array.length / 2;
        
        bubbleSort(array, array.length, midVal);
        
        answer = array[midVal];
        
        return answer;
    }
    
    static void bubbleSort(int[] a, int n, int m){
        for(int i = 0; i <= m; i++)
            for(int j = n-1; j > i; j--)
                if(a[j-1] > a[j])
                    swap(a, j-1, j);
    }
    
    static void swap(int[] a, int num1, int num2){
        int tmp = a[num1];
        a[num1] = a[num2];
        a[num2] = tmp;
    } 
}