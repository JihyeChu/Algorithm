class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(!(4 == s.length() || 6 == s.length())){
            return answer;
        }
        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                return answer;
            }
        }
        return true;
    }
}