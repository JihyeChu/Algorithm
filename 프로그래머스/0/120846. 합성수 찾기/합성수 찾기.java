class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=4; i<=n; i++){
            int count = 2;
            for(int j=2; j<i; j++){
                if(count >= 3){
                    answer++;
                    break;
                }
                if(i%j == 0){
                    count++;
                }
            }
        }
        return answer;
    }
}