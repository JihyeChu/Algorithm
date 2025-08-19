class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(char my : my_string.toCharArray()){
            if(Character.isDigit(my)){
                sb.append(my);
            }else{
                if(sb.length() > 0){
                    answer += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        
        if(sb.length() > 0){
            answer += Integer.parseInt(sb.toString());
        }                
        
        return answer;   
    }
}