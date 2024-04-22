class Solution {
    public int solution(int n) {
        int answer = 0;
        
        answer = n / 7;
        if(n % 7 == 0) {
           return answer;
        }else if(n % 7 < 7){
            answer++;
        }
        

        return answer;
    }
}