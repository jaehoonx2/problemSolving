class Solution {
    public boolean solution(int x) {
        String str = Integer.toString(x);
        
        int sum = 0;
        for(int i = 0; i < str.length(); i++)
            sum += Integer.parseInt(str.substring(i, i+1));
        
        return x % sum == 0 ? true : false;
    }
}