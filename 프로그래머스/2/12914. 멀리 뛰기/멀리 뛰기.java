class Solution {
    public long solution(int n) {
        long[] array = new long[n+1];
        array[0] = 1L;
        array[1] = 1L;

        for(int i=2; i<=n; i++){
            array[i] = (array[i - 2] + array[i - 1])%1234567;
        }
        return array[n];
    }
}