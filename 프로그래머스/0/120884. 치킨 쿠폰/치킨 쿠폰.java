class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int service = 0;
        
        while(coupon >= 10){
            int temp = coupon / 10;
            service += temp;
            coupon = coupon - (temp * 10) + temp;
        }
        
        return service;
    }
}