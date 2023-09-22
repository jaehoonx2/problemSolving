class Solution {
    public String solution(String my_string) {
        char ori[] = my_string.toLowerCase().toCharArray();
        
        alphabetBubbleSort(ori, ori.length);
        
        String answer = new String(ori);
        return answer;
    }
    
    static void swap(char[] arr, int num1, int num2){
        char tmp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = tmp;
    }
    
    static void alphabetBubbleSort(char[] arr, int length){
        for(int i = 0; i < length - 1; i++){
            
            for(int j = i+1; j < length; j++){
                if((int) arr[j] < (int) arr[i])
                    swap(arr, i, j);
            }
        }
    }
}