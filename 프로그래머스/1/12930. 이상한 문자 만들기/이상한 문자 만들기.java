class Solution {
     public String solution(String s) {
        String answer = "";
        int num = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                num = 0;
                answer += ' ';
                continue;
            }
            if(num==0 || num%2==0){
                answer += s.substring(i, i+1).toUpperCase();
            }else{
                answer += s.substring(i, i + 1).toLowerCase();
            }
            num++;

        }
        return answer;
    }
}