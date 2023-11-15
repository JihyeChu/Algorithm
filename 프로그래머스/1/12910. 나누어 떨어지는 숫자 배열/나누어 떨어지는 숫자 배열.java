import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int l : arr){
            if(l%divisor == 0){
                list.add(l);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        if(list.isEmpty()){
            return new int[]{-1};
        }
        Arrays.sort(answer);
        return answer;
    }
}