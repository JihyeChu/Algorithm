import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> num = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                num.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> arr = new ArrayList<>(num);
        Collections.sort(arr);

        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i] += arr.get(i);
        }

        return answer;
    }
}