class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        
        for(char word : my_string.toCharArray()){
            if(word == letter.charAt(0)){
                continue;
            }
            sb.append(word);
        }
        
        return sb.toString();
    }
}