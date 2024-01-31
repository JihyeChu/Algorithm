import java.util.Arrays;
class Solution {
     public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

       for(int i=0; i<10; i++){
           boolean found = false;
           for(int num : numbers){
               if(i == num){
                   found = true;
                   break;
               }
           }
           if(!found){
               answer+=i;
           }
       }
        return answer;
    }
}