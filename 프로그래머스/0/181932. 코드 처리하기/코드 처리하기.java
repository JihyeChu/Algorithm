class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;

        for(int i=0; i<code.length(); i++){
            char currentChar = code.charAt(i);
            if(currentChar == '1'){
                mode = 1 - mode;
                continue;
            }
            if(i%2 == mode){
                answer += currentChar;
            }
        }
        return answer.length()==0?"EMPTY":answer;
    }
}