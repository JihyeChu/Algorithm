class Solution {
     public String solution(int[] numLog) {
        String answer = "";
        for(int i=0; i<numLog.length; i++){
            if(i+1==numLog.length){
                break;
            }
            int num = numLog[i+1] - numLog[i];
            if(num == 1){
                answer += "w";
            }else if(num == -1){
                answer += "s";
            }else if(num == 10){
                answer += "d";
            }else if(num == -10){
                answer += "a";
            }
        }
        return answer;
    }
}