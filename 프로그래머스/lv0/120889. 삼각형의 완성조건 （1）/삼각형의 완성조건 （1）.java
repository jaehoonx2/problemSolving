class Solution {
    public int solution(int[] sides) {
        bubbleSort(sides, sides.length);
        return (sides[0] < (sides[1] + sides[2])) ? 1 : 2;
    }
    
    static void bubbleSort(int[] a, int n){
        for(int i = 0; i < n; i++){
            for(int j = n-1; j > 0; j--){
                if(a[j-1] < a[j])
                    swap(a, j-1, j);
            }
        }
    }
    
    static void swap(int[] a, int num1, int num2){
        int tmp = a[num1];
        a[num1] = a[num2];
        a[num2] = tmp;
    }
}