class Solution {
    public int solution(String[] spell, String[] dic) {
        
        boolean[] isMakable = new boolean[dic.length];
        
        // 1. dic의 단어들을 순회함
        for(int i = 0; i < dic.length; i++){
            //2. cnt 초기화
            int[] cnt = new int[spell.length];
            
            for(int j = 0; j < dic[i].length(); j++)
                // 3. dic[i] 단어 한 글자에 spell 전체를 대조해서 spell[k]의 출현횟수를 cnt[k]에 기록
                for(int k = 0; k < spell.length; k++)
                    if(spell[k].equals(dic[i].substring(j, j+1)))
                        cnt[k] += 1;
                    else
                        continue;
           
            
            // 4. dic[i]가 spell에 담긴 알파벳 한번씩만 사용했는지 cnt를 확인하여 체크
            isMakable[i] = true;
            for(int m = 0; m < cnt.length; m++)
                isMakable[i] = cnt[m] != 1 ? false : isMakable[i];
        }

        
        for(int m = 0; m < isMakable.length; m++)
            if(isMakable[m])
                return 1;
        
        return 2;
    }
}