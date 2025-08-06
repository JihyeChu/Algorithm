class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=10; i++){
            if(n/i <= i){
                answer = i;
                break;
            }
            n /= i;
        }
        return answer;
    }
}