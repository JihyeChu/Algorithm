import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] answer_arr = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            answer_arr[i] = s.charAt(i);
        }
        Arrays.sort(answer_arr);
        for(int i=answer_arr.length-1; i>=0; i--){
            answer += answer_arr[i];
        }

        return answer;
    }
}