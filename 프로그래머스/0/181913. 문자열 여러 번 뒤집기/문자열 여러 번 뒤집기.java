import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i = 0; i < queries.length; i++){
            StringBuilder sb = new StringBuilder(my_string.substring(queries[i][0], queries[i][1] + 1));
            my_string = my_string.substring(0, queries[i][0]) +
                        sb.reverse().toString() +
                        my_string.substring(queries[i][1] + 1);
        }
        
        return my_string;
    }
}