class Solution {
    public int solution(int order) {
        String ord = String.valueOf(order);
        char[] arr = ord.toCharArray();
        int num = 0;
        
        for(int i = 0;  i < arr.length; i++){
            switch(Character.getNumericValue(arr[i])){
                case 3 : case 6 : case 9 :
                    num++;
            }
        }
        
        return num;
    }
}