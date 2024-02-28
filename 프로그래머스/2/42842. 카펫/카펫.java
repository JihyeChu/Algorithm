import java.util.Arrays;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        for(int i=1; i<=total; i++){
            if(total%i == 0){
                int row = total/i;
                if((i-2)*(row-2) == yellow){
                    answer[0] = row;
                    answer[1] = i;
                    return answer;
                }
            }

        }

        return answer;
    }
}