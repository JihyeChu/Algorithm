class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = 0;
        for(int i=0; i<n; i++){
            answer[i] = num+x;
            num = answer[i];
        }

        return answer;
    }
}