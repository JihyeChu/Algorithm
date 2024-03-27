class Solution {
     public int solution(int number, int limit, int power) {
        int answer = 0;
        int cnt = 0;
        int[] person = new int[number];
        for(int i=1; i<=number; i++){
            for(int j=1; j*j<=i; j++){
                if(j*j==i){
                    cnt++;
                } else if (i%j==0) {
                    cnt+=2;
                }
            }
            if(cnt <= limit){
                person[i-1] = cnt;
            }else{
                person[i-1] = power;
            }
            cnt = 0;
        }

        for(int p : person){
            answer += p;
        }

        return answer;
    }
}