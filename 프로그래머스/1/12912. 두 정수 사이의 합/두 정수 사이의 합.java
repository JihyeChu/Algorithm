class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = 0;
        int min = 0;
        if (a > b) {
            max = a;
            min = b;
        } else if (a == b) {
            return a;
        } else{
            max = b;
            min = a;
        }
        for(int i=0; i<=max-min; i++){
            answer += min+i;
        }
        return answer;
    }
}