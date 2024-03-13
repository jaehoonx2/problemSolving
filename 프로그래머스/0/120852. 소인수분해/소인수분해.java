import java.util.*;

class Solution {
    public int[] solution(int n) {
        // 1. 주어진 수가 소수일 경우: 주어진 수 1개로 이루어진 배열 반환
        if(isPrime(n))
            return new int[]{n};
    
        // 2. 주어진 수가 합성수일 경우: 2부터 소인수분해 시작
        Set<Integer> set = new HashSet<Integer>();
        int divisor = 2;
        
        while(!isPrime(n)){
            if(n % divisor == 0){
                n = n / divisor;
                
                if(!set.contains(divisor))
                    set.add(divisor);
            } else
                divisor = getNextPrime(divisor);
        }
        
        // 3. Set<Integer> → int[] 변환하여 반환 
        Integer[] arr1 = set.toArray(new Integer[0]);
        int[] arr2 = new int[arr1.length];
        
        for(int j = 0; j < arr2.length; j++)
            arr2[j] = arr1[j];
        
        return arr2;
    }
    
    // (함수)isPrime: 주어진 파라미터가 소수인지 아닌지 판별
    public boolean isPrime(int number){
        boolean isPrime = true;
        
        for(int i = 2; i < number; i++)
            if(number % i == 0){
                isPrime = false;
                break;
            }

        return isPrime;
    }
    
    // (함수)getNextPrime: 주어진 파라미터보다 큰, 바로 다음 소수 반환    
    public int getNextPrime(int number){
        while(true){
            number++;
            if(isPrime(number))
                break;
        }
        
        return number;
    }
}