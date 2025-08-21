class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        while(count < n){
            answer++;
            if(String.valueOf(answer).contains("3") || answer%3==0) continue;
            count++;
        }
        
        return answer;
    }
}