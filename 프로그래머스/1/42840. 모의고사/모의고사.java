import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] answers) {
        int[] user1 = {1, 2, 3, 4, 5};
        int[] user2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] user3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] num = new int[3];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<answers.length; i++){
            if(user1[i%5] == answers[i]){
                num[0]++;
            }
            if(user2[i%8] == answers[i]){
                num[1]++;
            }
            if(user3[i%10] == answers[i]){
                num[2]++;
            }
        }

        int max = Math.max(Math.max(num[0], num[1]), num[2]);
        if(max == num[0]){
            list.add(1);
        }
        if(max == num[1]){
            list.add(2);
        }
        if(max == num[2]){
            list.add(3);
        }

    int[] answer = new int[list.size()];
    for(int i=0; i<list.size(); i++){
        answer[i] = list.get(i);
    }
       
        return answer;
    }
}