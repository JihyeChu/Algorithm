import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int num = 0;
        int[] apple = new int[score.length];

        Arrays.sort(score);

        for(int i=0; i<score.length; i++){
            apple[i] = score[score.length - i -1];
        }

        while(true){
            if(apple.length <= num || num+m > apple.length){
                
                break;
            }
            answer += apple[num-1+m] * m;
            num += m;
        }
        
        return answer;
    }
}