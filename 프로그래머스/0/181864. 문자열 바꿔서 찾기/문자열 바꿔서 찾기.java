class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "b").replace("B", "a");
        
        return myString.contains(pat.toLowerCase()) ? 1 : 0;
    }
}