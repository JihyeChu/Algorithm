import java.util.*;
class Solution {
     public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int i = 0;
        for(String q : quiz){
            String[] su = q.split(" ");
            int num1 = Integer.parseInt(su[0]);
            int num2 = Integer.parseInt(su[2]);
            int num3 = Integer.parseInt(su[4]);

            String operator = su[1];
            int dap = operator.equals("+") ? num1+num2 : num1-num2;
            boolean correct = dap == num3;

            answer[i++] = (correct ? "O" : "X");

        }

        return answer;
    }
}