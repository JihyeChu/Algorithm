import java.util.Arrays;

class Solution {
     public int solution(int[] people, int limit) {
        int answer = 0;
        int weight_s = 0;
        int weight_b = people.length-1;

        Arrays.sort(people);

        while (weight_s <= weight_b) {
            if(people[weight_s] + people[weight_b] <= limit){
                weight_s++;
                weight_b--;
            }else{
                weight_b--;
            }
            answer++;

        }

        return answer;
    }
}