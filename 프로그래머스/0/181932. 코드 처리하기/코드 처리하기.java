class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i=0; i<code.length(); i++){
            char currentChar = code.charAt(i);
            
            if(currentChar == '1'){
                mode = 1 - mode;    
            }else{
                if(mode == 0 && i%2 == 0){
                    answer += currentChar;
                }else if(mode == 1 && i%2 == 1){
                    answer += currentChar;
                }
            }
            
        }
        
        return answer.length()==0?"EMPTY":answer;
    }
}