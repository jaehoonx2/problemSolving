import java.util.*;

class Solution {
    public int solution(int[] date1, int[] date2) {
        Date dt1 = new Date(date1[0], date1[1], date1[2]);
        Date dt2 = new Date(date2[0], date2[1], date2[2]);
        
        return dt1.before(dt2) ? 1 : 0;
    }
}