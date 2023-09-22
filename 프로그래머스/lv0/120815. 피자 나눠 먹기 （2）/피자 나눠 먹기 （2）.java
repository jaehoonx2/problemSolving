class Solution {
    public int solution(int n) {
        int pizza = 1;
        
        while(true){
            int pieceNum = 6 * pizza;
            
            if(pieceNum % n == 0)
                return pizza;
            else
                pizza++;
        }
    }
}