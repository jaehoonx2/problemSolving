class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int arr1Sum = 0;
        int arr2Sum = 0;
        
        if(arr1.length != arr2.length)
            return arr1.length > arr2.length ? 1 : -1;
        else {
            for(int i = 0; i < arr1.length; i++){
                arr1Sum += arr1[i];
                arr2Sum += arr2[i];
            }
            
            return arr1Sum > arr2Sum ? 1 : arr2Sum > arr1Sum ? -1 : 0;
        }   
    }
}