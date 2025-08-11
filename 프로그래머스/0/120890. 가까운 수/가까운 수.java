import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        int minDiff = Integer.MAX_VALUE;
        
        for(int i=0; i<array.length; i++){
            if(minDiff > Math.abs(array[i] - n)){
                minDiff = Math.abs(array[i] - n);
                answer = array[i];
            }else if(Math.abs(array[i] - n) == minDiff && array[i] < answer){
                answer = array[i];
            }
        }
        
        return answer;
    }
}