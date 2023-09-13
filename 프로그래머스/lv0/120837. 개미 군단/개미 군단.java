class Solution {
    static final int general = 5;
    static final int soldier = 3;
    static final int slave   = 1;
    
    public int solution(int hp) {
        int antCnt = 0;
        int nowHp = hp;
        
        if(nowHp >= general) {
            while (nowHp >= general) {
                nowHp -= general;
                antCnt++;
            }
        }

        if(nowHp >= soldier) {
            while (nowHp >= soldier) {
                nowHp -= soldier;
                antCnt++;
            }
        }    
        
        if(nowHp >= slave) {
            while (nowHp >= slave) {
                nowHp -= slave;
                antCnt++;
            }
        }          
        
        return antCnt;
    }
}