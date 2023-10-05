import java.util.LinkedList;
import java.util.Queue;
class Solution {
     public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> card1 = new LinkedList<>();
        Queue<String> card2 = new LinkedList<>();

        for(String c : cards1){
            card1.add(c);
        }

        for(String c : cards2){
            card2.add(c);
        }

        for(int i=0; i< goal.length; i++){
            if(goal[i].equals(card1.peek())){
                card1.poll();
            }else if(goal[i].equals(card2.peek())){
                card2.poll();
            }else{
                return "No";
            }
        }
        return answer;
    }
}