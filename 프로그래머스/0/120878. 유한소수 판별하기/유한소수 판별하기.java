class Solution {
    public int solution(int a, int b) {
        int gcd_val = gcd(a, b); 
        b = b / gcd_val;
        
        while(b % 2 == 0) b /= 2;
        while(b % 5 == 0) b /= 5;
        
        if(b == 1) return 1;
        else return 2;
    }

    // 유클리드 호제법
    private int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b, a % b);
    }
}
