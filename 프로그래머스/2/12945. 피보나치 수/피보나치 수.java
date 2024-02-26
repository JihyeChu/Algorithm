class Solution {
    public int solution(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = (a + b)%1234567;
            a = b;
            b = sum;
        }
        return b;
    }
}